package org.app.entities.general;


/**
 * @author gentjan kolicaj
 *
 */
public enum LanguageType {

	ALBANIAN("ALBANIAN"),ENGLISH("ENGLISH"),GERMAN("GERMAN"),ITALIAN("ITALIAN"),FRENCH("FRENCH");
	
	private String value;
	
	private LanguageType(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
