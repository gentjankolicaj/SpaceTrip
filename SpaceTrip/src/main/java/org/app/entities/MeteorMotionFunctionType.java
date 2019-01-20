package org.app.entities;

public enum MeteorMotionFunctionType  {
	
	X_Y0("X_Y0"),X2_Y0("X2_Y0"),X3_Y0("X3_Y0"),X4_Y0("X4_Y0");
	
	
     private String value;
	
	private MeteorMotionFunctionType(String value) {
		this.value=value;
	}
	
	
	public String getValue() {
		return value;
	}

}
