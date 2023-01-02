package io.gk.game.util;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum LoggerType {
	
	CONSOLE_OUT("CONSOLE_OUT"),CONSOLE_ERR("CONSOLE_ERR"),JAVA_LOGGER("JAVA_LOGGER");

    private final String value;

    LoggerType(String value) {
        this.value = value;
    }
	
	
	public String getValue() {
		return value;
	}

}
