package org.app.motion;

import org.app.entities.Location;
import org.app.entities.MotionFunctionType;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class MotionFunctionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculate() {

		MotionFunctionType[] array = MotionFunctionType.values();

		for (MotionFunctionType var : array) {
			
			MotionFunction function = FunctionFactory.getMotionFunction(var);
			int i = 0;
			Location tmp = new Location(20,20);

			while (i < 20) {
				tmp = function.calculate(tmp);
				i++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("========================================== End execution of method testCalculate() ==========================================================");
		System.out.println();
	}

	@Test
	public void testCalculate2() {
		MotionFunctionType[] array = MotionFunctionType.values();

		for (MotionFunctionType var : array) {
			
			MotionFunction function = FunctionFactory.getMotionFunction(var);
			int i = 0;
			Location tmp = new Location(20,20);

			while (i < 20) {
				tmp = function.calculate(tmp);
				i++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("========================================== End execution of method testCalculate2() ==========================================================");
		System.out.println();
	}

}
