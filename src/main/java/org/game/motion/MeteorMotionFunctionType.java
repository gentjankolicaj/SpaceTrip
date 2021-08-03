package org.game.motion;

/**
 * @author gentjan kolicaj
 * 
 * 					
 */
public enum MeteorMotionFunctionType  {
	
	X_Y0("X_Y0"),X2_Y0("X2_Y0"),X3_Y0("X3_Y0"),X4_Y0("X4_Y0");


    private final String value;

    MeteorMotionFunctionType(String value) {
        this.value = value;
    }
	
	
	public String getValue() {
		return value;
	}

}
