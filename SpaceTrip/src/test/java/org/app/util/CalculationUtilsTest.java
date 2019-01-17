package org.app.util;

import org.app.globals.AppConfig;
import org.app.gui.GamePanel;
import org.junit.Before;
import org.junit.Test;

public class CalculationUtilsTest {

	private static int var = 2;
	private static boolean print = false;

	@Test
	public void callTestMethods() {
		if (var == 2) {
			testCalculateCoordinateYInt();
			testCalculateCoordinateYDouble();
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

	public void testCalculateCoordinateYDouble() {
	
	}



}
