package io.gentjankolicaj.game.motion;


/**
 * @author gentjan kolicaj
 */
public class FunctionFactory {

	private FunctionFactory() {
	}

	public static Function getAlienFunction(AlienMotionFunctionType alienFunctionType) {
		return new AlienMotionFunction(alienFunctionType);

	}

	public static Function getMeteorFunction(MeteorMotionFunctionType meteorFunctionType) {
		return new MeteorMotionFunction(meteorFunctionType);

	}

}
