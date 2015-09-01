package org.eclipse.incquery.viewmodel.sirius.interpreter;

import hu.bme.mit.inf.eclipse.logging.utils.LoggingUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.sirius.common.tools.api.contentassist.ContentContext;
import org.eclipse.sirius.common.tools.api.contentassist.ContentInstanceContext;
import org.eclipse.sirius.common.tools.api.contentassist.ContentProposal;
import org.eclipse.sirius.common.tools.api.contentassist.IProposalProvider;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;

public class IncQueryInterpreterProposalProvider implements IProposalProvider {

	private static final Logger logger = LoggingUtils.getLogger(IncQueryInterpreterProposalProvider.class);
	
	
	public IncQueryInterpreterProposalProvider() {
		logger.info("Constructor");
	}

	@Override
	public List<ContentProposal> getProposals(IInterpreter interpreter,
			ContentContext context) {
		logger.info("getProposals");
		
		List<ContentProposal> result = new ArrayList<ContentProposal>();
		
		if (context == null || !(interpreter instanceof IncQueryInterpreter)) {
			// Nothing to do...
		} else if (context.getContents() == null || context.getContents().length() == 0) {
			result.add(getNewEmtpyExpression());
		} else {
			String regex = "^" + context.getContents().replace(".", "\\.").replace("(", "\\(").replace(")", "\\)") + ".*$";
			for (String expression : ((IncQueryInterpreter) interpreter).getAcceptableExpressions()) {
				if (expression.matches(regex)) {
					result.add(new ContentProposal(expression.replace(context.getContents(), ""), expression, expression));
				}
			}
		}
		
		return result;
	}

	@Override
	public List<ContentProposal> getProposals(IInterpreter interpreter,
			ContentInstanceContext context) {
		logger.info("getProposals-instance context");

		// TODO Auto-generated method stub
		return new ArrayList<ContentProposal>();
	}

	@Override
	public ContentProposal getNewEmtpyExpression() {
		logger.info("getNewEmptyExpression");

		return new ContentProposal(
				IncQueryInterpreterConstants.PREFIX,
				IncQueryInterpreterConstants.PREFIX,
				IncQueryInterpreterConstants.PREFIX_INFORMATION);
	}
}