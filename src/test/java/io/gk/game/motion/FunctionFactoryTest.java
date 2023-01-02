package io.gk.game.motion;


import io.gk.game.entities.Location;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class FunctionFactoryTest {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	void testGetMotionFunction() {
		AlienMotionFunctionType[] array = AlienMotionFunctionType.values();

		Function<Location, Location> function = FunctionFactory.getAlienFunction(AlienMotionFunctionType.X2_SINX);

		assertNotNull(function);

		int i = 0;
		Location tmp = new Location();
		while (i < 10) {
			tmp = function.calculate(tmp);
			i++;
			
		}
	}

}
