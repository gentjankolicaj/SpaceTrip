package org.app.util;

import java.util.Random;

import org.app.globals.AppConfig;
import org.app.globals.GameConfig;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class CalculationUtils {
	
	
	public static int calculateSinY(int bumps, int x) {
		double b=bumps;
		double xValue=x;
		return (int) calculateSinY(b,xValue);
		
	}
	public static int calculateCosY(int bumps,int x) {
		double b=bumps;
		double xValue=x;
		return (int) calculateCosY(b,xValue);
		
	}
	
	
	public static double calculateSinY(double bumps,double x) {
		return calcSin(bumps,x);
	}
	
	
	public static double calculateCosY(double bumps,double x) {
		return calcCos(bumps,x);
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
	
	
	
	public static int[][] getRandomArray2D(int maxValue, int dimSize) {
		Random tempRand = new Random();
		int temp = Math.abs(GameConfig.DISTANCE_FROM_SHIP_AT_START - maxValue);
		int[][] tempArray = new int[dimSize][dimSize];

		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < tempArray[i].length; j++) {
				int tempValue = tempRand.nextInt(temp) +GameConfig.DISTANCE_FROM_SHIP_AT_START;
				int tempValue2 = tempRand.nextInt(temp) + GameConfig.DISTANCE_FROM_SHIP_AT_START;
				while ((Math.abs(tempValue - tempValue2)) < GameConfig.MIN_DIFF_BETWEEN_COORDS) {
					tempValue2 = generateAnother(tempRand, temp) + GameConfig.DISTANCE_FROM_SHIP_AT_START;
				}
				tempArray[i][j] = tempValue;

			}

		}

		return tempArray;
	}
	
	
	private static int generateAnother(Random random, int maxValue) {
		return random.nextInt(maxValue) + 1;
	}
	
	

}
