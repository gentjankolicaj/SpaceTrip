package org.app.motion;

import org.app.entities.Location;
import org.app.exceptions.BumpException;
import org.app.util.CalculationUtils;
import org.app.util.LogUtils;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class AlienMotionFunction implements Function<Location, Location> {
	
	//Todo: to be implemented speed so it can be configured at GameConfig.
	//Todo: I will be doing it when I will have free time.(And maybe i will develop anther game).

	private AlienMotionFunctionType functionType;
	
	private int bumps;

	AlienMotionFunction(AlienMotionFunctionType functionType) {
		this.functionType = functionType;
		this.bumps=1;
	}

	/**
	 * 
	 * @code: Here functions y=cos(x), y=sin(x) are not purely used.I have implemented some methods to take the changes of values of x and use those for generating values of y.
	 *    Newly generated values of y resemble y=sin(x) and y=cos(x).
	 */
	@Override
	public Location calculate2(Location input) {
		Location output = new Location();
		if (functionType.equals(AlienMotionFunctionType.X_Y0)) {
			int xValue = input.getX()-1;
			int yValue = input.getY();
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_Y0)) {
			int xValue = input.getX()-2;
			int yValue = input.getY();
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X3_Y0)) {
			int xValue = input.getX()-3;
			int yValue = input.getY();
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X0_Y)) {
			int xValue = input.getX();
			int yValue = input.getY()-1;
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X0_Y2)) {
			int xValue = input.getX();
			int yValue = input.getY()-2;
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X0_Y3)) {
			int xValue = input.getX();
			int yValue = input.getY()-3;
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_Y)) {
			int xValue = input.getX()-1;
			int yValue = input.getY()-1;
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_Y2)) {
			int xValue = input.getX()-2;
			int yValue = input.getY()-2;
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X3_Y3)) {
			int xValue = input.getX()-3;
			int yValue = input.getY()-3;
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_Y2)) {
			int xValue = input.getX()-1;
			int yValue = input.getY()-2;
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_Y)) {
			int xValue = input.getX()-2;
			int yValue = input.getY()-1;
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_COSX)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX());
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_COSX)) {
			int xValue = input.getX()-2;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX());
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X3_COSX)) {
			int xValue = input.getX()-3;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX());
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_COS2X)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX()*2);
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_COS3X)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX()*3);
			output.setX(xValue);
			output.setY(yValue);
		}else if (functionType.equals(AlienMotionFunctionType.X_SINX)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX());
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_SINX)) {
			int xValue = input.getX()-2;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX());
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X3_SINX)) {
			int xValue = input.getX()-3;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX());
			output.setX(xValue);
			output.setY(yValue);
		}else if (functionType.equals(AlienMotionFunctionType.X_SIN2X)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX()*2);
			output.setX(xValue);
			output.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_SIN3X)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX()*3);
			output.setX(xValue);
			output.setY(yValue);
		}else {
			int xValue = input.getX()-1;
			int yValue = input.getY();
			output.setX(xValue);
			output.setY(yValue);
		}
		LogUtils.print(output);
		return output;

	}
	
	
	@Override
	public Location calculate(Location input) {
		if (functionType.equals(AlienMotionFunctionType.X_Y0)) {
			int xValue = input.getX()-1;
			int yValue = input.getY();
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_Y0)) {
			int xValue = input.getX()-2;
			int yValue = input.getY();
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X3_Y0)) {
			int xValue = input.getX()-3;
			int yValue = input.getY();
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X0_Y)) {
			int xValue = input.getX();
			int yValue = input.getY()-1;
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X0_Y2)) {
			int xValue = input.getX();
			int yValue = input.getY()-2;
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X0_Y3)) {
			int xValue = input.getX();
			int yValue = input.getY()-3;
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_Y)) {
			int xValue = input.getX()-1;
			int yValue = input.getY()-1;
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_Y2)) {
			int xValue = input.getX()-2;
			int yValue = input.getY()-2;
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X3_Y3)) {
			int xValue = input.getX()-3;
			int yValue = input.getY()-3;
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_Y2)) {
			int xValue = input.getX()-1;
			int yValue = input.getY()-2;
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_Y)) {
			int xValue = input.getX()-2;
			int yValue = input.getY()-1;
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_COSX)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX());
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_COSX)) {
			int xValue = input.getX()-2;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX());
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X3_COSX)) {
			int xValue = input.getX()-3;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX());
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_COS2X)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX()*2);
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_COS3X)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateCosY(bumps, input.getX()*3);
			input.setX(xValue);
			input.setY(yValue);
		}else if (functionType.equals(AlienMotionFunctionType.X_SINX)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX());
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X2_SINX)) {
			int xValue = input.getX()-2;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX());
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X3_SINX)) {
			int xValue = input.getX()-3;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX());
			input.setX(xValue);
			input.setY(yValue);
		}else if (functionType.equals(AlienMotionFunctionType.X_SIN2X)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX()*2);
			input.setX(xValue);
			input.setY(yValue);
		} else if (functionType.equals(AlienMotionFunctionType.X_SIN3X)) {
			int xValue = input.getX()-1;
			int yValue=CalculationUtils.calculateSinY(bumps, input.getX()*3);
			input.setX(xValue);
			input.setY(yValue);
		}else {
			int xValue = input.getX()-1;
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
