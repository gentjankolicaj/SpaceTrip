package org.app.util;

public enum StringType {
	
	RAW("RAW"),JSON("JSON");
	private String value;
	
	private StringType(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}
	

}
