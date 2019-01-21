package org.app.util;

import java.util.logging.Logger;

import org.app.globals.AppConfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class LogUtils {

	private static Logger logger = Logger.getLogger(LogUtils.class.getName());
	private static ObjectMapper mapper = new ObjectMapper();

	public static void print(String string) {
		if (AppConfig.LOGGER_TYPE.equals(LoggerType.JAVA_LOGGER))
			logger.info(determineStringType(string));
		else if (AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_OUT))
			System.out.println(determineStringType(string));
		else if (AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_ERR))
			System.err.println(determineStringType(string));
	}

	public static void print(Object object) {
		if (AppConfig.LOGGER_TYPE.equals(LoggerType.JAVA_LOGGER))
			logger.info(determineStringType(object));
		else if (AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_OUT))
			System.out.println(determineStringType(object));
		else if (AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_ERR))
			System.err.println(determineStringType(object));
	}

	private static String determineStringType(String string) {
		if (AppConfig.STRING_TYPE.equals(StringType.JSON)) {
			String tmp = "";
			try {
				tmp = mapper.writeValueAsString(string);
			} catch (JsonProcessingException j) {

				j.printStackTrace();
			}
			return tmp;
		} else {
			if (string != null)
				return string;
			else
				return "";
		}

	}

	private static String determineStringType(Object string) {
		if (AppConfig.STRING_TYPE.equals(StringType.JSON)) {
			String tmp = "";
			try {
				tmp = mapper.writeValueAsString(string);
			} catch (JsonProcessingException j) {

				j.printStackTrace();
			}
			return tmp;
		} else {
			if (string != null)
				return string.toString();
			else
				return "";
		}

	}

}
