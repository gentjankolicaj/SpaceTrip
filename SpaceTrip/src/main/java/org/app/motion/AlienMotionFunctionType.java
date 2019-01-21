package org.app.motion;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum AlienMotionFunctionType {
	
	X_Y0("X_Y0"),X2_Y0("X2_Y0"),X3_Y0("X3_Y0"),
	
	X0_Y("X0_Y"),X0_Y2("X0_Y2"),X0_Y3("X0_Y3"),
	
	X_Y("X_Y"),X2_Y2("X2_Y2"),X3_Y3("X3_Y3"),
	
	X_Y2("X_Y2"), X2_Y("X2_Y"),
	
	X_COSX("X_COSX"),X2_COSX("X2_COSX"),X3_COSX("X3_COSX"),
	
	X_COS2X("X_COS2X"),X_COS3X("X_COS3X"),
	
    X_SINX("X_SINX"),X2_SINX("X2_SINX"),X3_SINX("X3_SINX"),
	
	X_SIN2X("X_COS2X"),X_SIN3X("X_COS3X");
	
	private String value;
	
	private AlienMotionFunctionType(String value) {
		this.value=value;
	}
	
	
	public String getValue() {
		return value;
	}

}
