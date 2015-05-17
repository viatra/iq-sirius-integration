package hu.bme.mit.inf.eclipse.logging.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingUtils {
	
	public static final Level DEFAULT_LEVEL = Level.INFO;
	
	private static Map<Class<?>, Level> loggingLevels = null;
	
	
	public static Logger getLogger(Class<?> clazz) {
		if (loggingLevels == null) {
			initialzeLoggingLevels();
		}
		
		if (loggingLevels.containsKey(clazz)) {
			return getLogger(clazz, loggingLevels.get(clazz));
		} else {
			return getLogger(clazz, DEFAULT_LEVEL);
		}
	}
	
	public static Logger getLogger(Class<?> clazz, Level level) {
		Logger logger = Logger.getLogger(clazz.getName());
		
		logger.setLevel(level);
		
		return logger;
	}
	
	private static void initialzeLoggingLevels() {
		loggingLevels = new HashMap<Class<?>, Level>();
	}

	// TODO kesobbre log4j-hez
//	public static void setLoggingLevel(Logger logger, Level level) {
//		LoggerContext context = (LoggerContext) LogManager.getContext(false);
//		
//		Configuration configuration = context.getConfiguration();
//		
//		configuration.getLoggerConfig(logger.getName()).setLevel(level);
//		
//		context.updateLoggers(configuration);
//	}
	
}
