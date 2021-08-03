package org.game.util;

import org.junit.jupiter.api.Test;


public class CalculationUtilsTest {

    private static final int var = 2;
    private static final boolean print = false;

    @Test
    public void callTestMethods() {
        if (var == 2) {
            testCalculateCoordinateYInt();
        } else
            testCalculateCoordinateYInt();
    }

    public void testCalculateCoordinateYInt() {
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		for (int x = 1000; x > -1001; x--) {
            int y=CalculationUtils.calculateCosY(3, x);
			System.out.println(y);

		}
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		for (int x = 1000; x > -1001; x--) {
            int y=CalculationUtils.calculateSinY(3, x);
			System.out.println(y);

		}

	}




}
