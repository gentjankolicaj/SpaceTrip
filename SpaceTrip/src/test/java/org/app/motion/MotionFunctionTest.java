package org.app.motion;

import org.app.entities.Location;
import org.app.entities.AlienMotionFunctionType;
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

		AlienMotionFunctionType[] array = AlienMotionFunctionType.values();

		for (AlienMotionFunctionType var : array) {
			
			Function<Location,Location> function = FunctionFactory.getAlienFunction(var);
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
		AlienMotionFunctionType[] array = AlienMotionFunctionType.values();

		for (AlienMotionFunctionType var : array) {
			
			Function<Location,Location> function = FunctionFactory.getAlienFunction(var);
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
