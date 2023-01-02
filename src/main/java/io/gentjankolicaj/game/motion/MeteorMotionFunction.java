package io.gentjankolicaj.game.motion;

import io.gentjankolicaj.game.entities.Location;
import io.gentjankolicaj.game.exceptions.BumpException;
import io.gentjankolicaj.game.globals.GameConfig;
import io.gentjankolicaj.game.util.LogUtils;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class MeteorMotionFunction implements Function<Location, Location> {

	private final MeteorMotionFunctionType functionType;

	MeteorMotionFunction(MeteorMotionFunctionType functionType) {
		this.functionType = functionType;
	}

	
	@Override
	public Location calculate2(Location input) {
		Location output = new Location();
		if (functionType.equals(MeteorMotionFunctionType.X_Y0)) {
			int xValue = input.getX()-(1+GameConfig.meteor_speed);
			int yValue = input.getY();
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(MeteorMotionFunctionType.X2_Y0)) {
			int xValue = input.getX()-(2+GameConfig.meteor_speed);
			int yValue = input.getY();
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(MeteorMotionFunctionType.X3_Y0)) {
			int xValue = input.getX()-(3+GameConfig.meteor_speed);
			int yValue = input.getY();
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(MeteorMotionFunctionType.X4_Y0)) {
			int xValue = input.getX()-(4+GameConfig.meteor_speed);
			int yValue = input.getY();
			input.setX(xValue);
			input.setY(yValue);
		}else {
			int xValue = input.getX()-(1+GameConfig.meteor_speed);
			int yValue = input.getY();
			output.setX(xValue);
			output.setY(yValue);
		}
		LogUtils.print(output);
		return output;

	}
	
	
	@Override
	public Location calculate(Location input) {
		if (functionType.equals(MeteorMotionFunctionType.X_Y0)) {
			int xValue = input.getX()-(1+GameConfig.meteor_speed);
			int yValue = input.getY();
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(MeteorMotionFunctionType.X2_Y0)) {
			int xValue = input.getX()-(2+GameConfig.meteor_speed);
			int yValue = input.getY();
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(MeteorMotionFunctionType.X3_Y0)) {
			int xValue = input.getX()-(3+GameConfig.meteor_speed);
			int yValue = input.getY();
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(MeteorMotionFunctionType.X4_Y0)) {
			int xValue = input.getX()-(4+GameConfig.meteor_speed);
			int yValue = input.getY();
			input.setX(xValue);
			input.setY(yValue);
		} else {
			int xValue = input.getX()-(1+GameConfig.meteor_speed);
			int yValue = input.getY();
			input.setX(xValue);
			input.setY(yValue);
			
		}
		LogUtils.print(input);
		return input;

	}

	@Override
	public void prepareFunction(Object... objects) {
	  Object bump=objects[0];
	  if(bump==null)
		  throw new BumpException("Bump number not set.Must be set at least to >=1.");
	  else {
		  Integer integer=(Integer) bump;
		  bump=integer;
	  }	
		
	}
	
	


}
