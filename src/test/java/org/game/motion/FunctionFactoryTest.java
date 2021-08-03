package org.game.motion;


import org.game.entities.Location;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FunctionFactoryTest {


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
