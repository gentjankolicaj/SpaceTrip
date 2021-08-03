package org.game.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.game.globals.AppConfig;

import java.util.logging.Logger;

/**
 * @author gentjan kolicaj
 */
public class LogUtils {

    private static final Logger logger = Logger.getLogger(LogUtils.class.getName());
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void print(Object object) {
        if (AppConfig.LOGGER_TYPE.equals(LoggerType.JAVA_LOGGER))
            logger.info(object.toString());
        else if (AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_OUT))
            System.out.println(object.toString());
        else if (AppConfig.LOGGER_TYPE.equals(LoggerType.CONSOLE_ERR))
            System.err.println(object.toString());
    }


}
