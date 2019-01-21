package org.app.util;

import java.util.logging.Logger;

import org.app.globals.AppConfig;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class LogUtils {

	private static Logger logger=Logger.getLogger(LogUtils.class.getName());
	
	public static void print(String string) {
		if(AppConfig.LOGGER_TYPE.equals(LoggerType.JAVA_LOGGER))
	  	logger.info(string);
		else if(AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_OUT))
			System.out.println(string);
		else if(AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_ERR))
			System.err.println(string);
	}
	
	public static void print(Object object) {
		if(AppConfig.LOGGER_TYPE.equals(LoggerType.JAVA_LOGGER))
		  	logger.info(object.toString());
			else if(AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_OUT))
				System.out.println(object.toString());
			else if(AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_ERR))
				System.err.println(object.toString());
	}
	
	
	
}
