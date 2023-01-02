package io.gentjankolicaj.game.util;

import io.gentjankolicaj.game.globals.AppConfig;

/**
 * @author gentjan kolicaj
 */
public class CalculationUtils {

	private CalculationUtils() {
	}

	public static int calculateSinY(int bumps, int x) {
		double b = bumps;
		double xValue = x;
		return (int) calculateSinY(b, xValue);

	}

	public static int calculateCosY(int bumps, int x) {
		double b = bumps;
		double xValue = x;
		return (int) calculateCosY(b, xValue);

	}


	public static double calculateSinY(double bumps, double x) {
		return calcSin(bumps, x);
	}


	public static double calculateCosY(double bumps, double x) {
		return calcCos(bumps, x);
	}


	private static double calcCos(double bumpsNumber, double x) {

		double fullRoadLength = AppConfig.GAME_PANEL_WIDTH;

		double intervalLength = fullRoadLength / bumpsNumber;

		double coef = 360.0 / intervalLength;

		double distance = intervalLength - x;

		double diffAngle = distance * coef;

		double intervalToRadian = Math.toRadians(diffAngle);

		double y = Math.abs(AppConfig.GAME_PANEL_HEIGHT * Math.cos(intervalToRadian));

		return y;
	}


	private static double calcSin(double bumpsNumber, double x) {

		double fullRoadLength = AppConfig.GAME_PANEL_WIDTH;

		double intervalLength = fullRoadLength / bumpsNumber;

		double coef = 360.0 / intervalLength;

		double distance = intervalLength - x;

		double diffAngle = distance * coef;

		double intervalToRadian = Math.toRadians(diffAngle);

		double y = Math.abs(AppConfig.GAME_PANEL_HEIGHT * Math.sin(intervalToRadian));

		return y;
	}


}
