package io.gk.game.util;

public enum StringType {
	
	RAW("RAW"),JSON("JSON");
    private final String value;

    StringType(String value) {
        this.value = value;
    }

	public String getValue() {
		return value;
	}
	

}
