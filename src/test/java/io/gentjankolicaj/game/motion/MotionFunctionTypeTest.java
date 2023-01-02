package io.gentjankolicaj.game.motion;


import org.junit.jupiter.api.Test;

public class MotionFunctionTypeTest {


    @Test
    public void testGetValue() {
        AlienMotionFunctionType[] array = AlienMotionFunctionType.values();

        for (AlienMotionFunctionType var : array)
			System.out.println(var.getValue());
	}

}
