package org.app.motion;

import org.app.util.LogUtils;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class FunctionFactory {
	
	
	public static Function getAlienFunction(AlienMotionFunctionType alienFunctionType) {
		return new AlienMotionFunction(alienFunctionType);
		
	}
	
	public static Function getMeteorFunction(MeteorMotionFunctionType meteorFunctionType) {
		return new MeteorMotionFunction(meteorFunctionType);
		
	}

}
