package hu.bme.mit.inf.sirius.interpreter.incquery;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncQueryExpression {

	private String expression;
	
	private Map<Parameter, String> parameters;
	
	private Command command;
	
	private String id;
	
	
	public enum Parameter {
		ref,
		match,
		packageNS;
		
		public static String getValuesForRegExp() {
			StringBuilder sb = new StringBuilder();
			
			for (Parameter value : Parameter.values()) {
				if (sb.length() != 0) {
					sb.append("|");
				}
				
				sb.append(value.toString());
			}
			
			return sb.toString();
		}
	}
	
	public enum Command {
		SEMANTIC_CANDIDATES_EXPRESSION,
		ASSOCIATED_ELEMENTS_EXPRESSION,
		TARGET_ELEMENTS_EXPRESSION;

		public static String getValuesForRegExp() {
			StringBuilder sb = new StringBuilder();
			
			for (Command value : Command.values()) {
				if (sb.length() != 0) {
					sb.append("|");
				}
				
				sb.append(value.toString());
			}
			
			return sb.toString();
		}
	}
	
	private IncQueryExpression() {
		this.parameters = new HashMap<IncQueryExpression.Parameter, String>();
	}
	
	public static IncQueryExpression parse(String expression) {
		if (expression == null) {
			return null;
		}
		
		if (!isValid(expression)) {
			return null;
		}

		IncQueryExpression result = new IncQueryExpression();
		
		
		Pattern patternProcessing = Pattern.compile(getRegExpForProcessing());
		Matcher matcherProcessing = patternProcessing.matcher(expression);

		matcherProcessing.matches();
		
		result.expression = matcherProcessing.group(1);
		
		if (expression.matches(getRegExpHasParameters())) {
			result.parameters = processParameters(matcherProcessing.group(2));
		}
		
		if (expression.matches(getRegExpIsProcessed())) {
			result.command = Command.valueOf(matcherProcessing.group(4));
			result.id = matcherProcessing.group(5);
		}

		return result;
	}
	
	public static boolean isIncQueryExpression(String expression) {
		return expression.startsWith(IncQueryInterpreterConstants.PREFIX);
	}
	
	public static boolean isValid(String expression) {
		if (!expression.matches(getRegExpForBasicValidation())) {
			return false;
		}
		
		// Check if a parameter exists only one
		if (expression.matches(getRegExpHasParameters())) {
			Pattern pattern = Pattern.compile(getRegExpForProcessing());
			Matcher matcher = pattern.matcher(expression);
		
			matcher.matches();
			
			String parametersString = matcher.group(2);
			if (processParameters(parametersString) == null) {
				return false;
			}
		}
		
		
		return true;
	}
	
	private static String getRegExpForBasicValidation() {
		return "^" + IncQueryInterpreterConstants.PREFIX + "([a-zA-Z0-9\\.]+)?"
				+ "(\\[([\\s]*(" + Parameter.getValuesForRegExp() + ")[\\s]*=[\\s]*[^\\s=,]+[\\s]*)([\\s]*,[\\s]*(" + Parameter.getValuesForRegExp() + ")[\\s]*=[\\s]*[^\\s=,]+[\\s]*)*\\])?"
				+ "(/(" + Command.getValuesForRegExp() + ")/(.*))?$";
	}
	
	private static String getRegExpForProcessing() {
		return "^" + IncQueryInterpreterConstants.PREFIX + "([a-zA-Z0-9\\.]+)?"
				+ "(\\[[^\\[\\]]+\\])?"
				+ "(/([a-zA-Z0-9_]+)/(.+))?$";
	}
	
	private static String getRegExpHasParameters() {
		return "^" + IncQueryInterpreterConstants.PREFIX + "([a-zA-Z0-9\\.]+)?"
				+ "(\\[[^\\[\\]]+\\])"
				+ "(/([a-zA-Z0-9_]+)/(.+))?$";
	}
	
	private static String getRegExpIsProcessed() {
		return "^" + IncQueryInterpreterConstants.PREFIX + "([a-zA-Z0-9\\.]+)?"
				+ "(\\[[^\\[\\]]+\\])?"
				+ "(/([a-zA-Z0-9_]+)/(.+))$";
	}

	private static Map<Parameter, String> processParameters(String parametersString) {
		Map<Parameter, String> result = new HashMap<IncQueryExpression.Parameter, String>();
		
		parametersString = parametersString
				.replaceAll("\\[", "")
				.replaceAll("\\]", "")
				.replaceAll("[\\s]", "");
		
		String[] parameterParts = null;
		for (String parameter : parametersString.split(",")) {
			parameterParts = parameter.split("=");
			
			if (!result.keySet().contains(Parameter.valueOf(parameterParts[0]))) {
				result.put(Parameter.valueOf(parameterParts[0]), parameterParts[1]);
			} else {
				return null;
			}
		}
		
		return result;
	}

	public Command getCommand() {
		return command;
	}
	
	public String getExpression() {
		return expression;
	}
	
	public String getId() {
		return id;
	}
	
	public String getParameter(Parameter parameter) {
		return parameters.get(parameter);
	}
	
	public Map<Parameter, String> getParameters() {
		return parameters;
	}
	
	public boolean isProcessed() {
		return (command == null ? false : true);
	}
	
	public boolean isPatternExpression() {
		return (!isInitExpression());
	}
	
	public boolean isInitExpression() {
		return (expression.equals("init"));
	}
}
