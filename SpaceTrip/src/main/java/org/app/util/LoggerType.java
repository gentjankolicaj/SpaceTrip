package org.app.util;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum LoggerType {
	
	CONSOLE_OUT("CONSOLE_OUT"),CONSOLE_ERR("CONSOLE_ERR"),JAVA_LOGGER("JAVA_LOGGER");
	
	private String value;
	
	private LoggerType(String value) {
		this.value=value;
	}
	
	
	public String getValue() {
		return value;
	}

}
