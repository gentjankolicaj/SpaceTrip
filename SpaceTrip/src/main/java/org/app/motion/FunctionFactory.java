package org.app.motion;

import org.app.entities.AlienMotionFunctionType;
import org.app.entities.MeteorMotionFunctionType;
import org.app.util.LogUtils;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class FunctionFactory {
	
	
	public static Function getAlienFunction(AlienMotionFunctionType alienFunctionType) {
		LogUtils.print("Alien function choosed : "+alienFunctionType.getValue());
		return new AlienMotionFunction(alienFunctionType);
		
	}
	
	public static Function getMeteorFunction(MeteorMotionFunctionType meteorFunctionType) {
		LogUtils.print("Meteor function choosed : "+meteorFunctionType.getValue());
		return new MeteorMotionFunction(meteorFunctionType);
		
	}

}
