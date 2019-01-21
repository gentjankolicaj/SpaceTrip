package org.app.motion;


import static org.junit.Assert.assertNotNull;

import org.app.entities.Location;
import org.junit.Before;
import org.junit.Test;

public class FunctionFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetMotionFunction() {
		AlienMotionFunctionType[] array=AlienMotionFunctionType.values();
		
		Function<Location,Location> function=FunctionFactory.getAlienFunction(AlienMotionFunctionType.X2_SINX);
		
		assertNotNull(function);
		
		int i=0;
		Location tmp=new Location();
		while(i<10) {
			tmp=function.calculate(tmp);
			i++;
			
		}
	}

}
