package org.app.motion;

import org.app.entities.MotionFunctionType;
import org.app.util.LogUtils;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class FunctionFactory {
	
	
	public static MotionFunction getMotionFunction(MotionFunctionType functionType) {
		LogUtils.print("Choosed function : "+functionType.getValue());
		return new MotionFunction(functionType);
		
	}

}
