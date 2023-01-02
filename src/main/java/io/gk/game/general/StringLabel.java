package io.gk.game.general;


/**
 * @author gentjan kolicaj
 *
 */
public class StringLabel {

	private LanguageType languageType;
	private String content;
	
	public StringLabel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringLabel(LanguageType languageType, String content) {
		super();
		this.languageType = languageType;
		this.content = content;
	}

	public LanguageType getLanguageType() {
		return languageType;
	}

	public void setLanguageType(LanguageType languageType) {
		this.languageType = languageType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
