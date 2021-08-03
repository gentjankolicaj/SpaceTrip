package org.game.util;

import org.game.entities.Location;
import org.game.globals.GameConfig;

import java.util.Random;

/**
 * @author gentjan kolicaj
 */
public class LocationUtils {
	
	
	public static Location[] getRandomMeteorLocation(int gameLevel) {
		Location[] locationArray=new Location[GameConfig.METEORS_PER_LEVEL[gameLevel]];
		int [][] coordinates=getRandomArray2DMeteors(2000, GameConfig.METEORS_PER_LEVEL[gameLevel]);
		for(int i=0;i<coordinates.length;i++) {
				int x=coordinates[i][0];
				int y=coordinates[i][1];
				Location tmp=new Location(x,y);
				locationArray[i]=tmp;
			
		}
		
		return locationArray;

	}
	
	
	public static  Location[] getRandomAlienLocation(int gameLevel) {
		Location[] locationArray=new Location[GameConfig.ALIEN_PER_LEVEL[gameLevel]];
		int [][] coordinates=getRandomArray2DAliens(1200, GameConfig.ALIEN_PER_LEVEL[gameLevel]);
		for(int i=0;i<coordinates.length;i++) {
				int x=coordinates[i][0];
				int y=coordinates[i][1];
				Location tmp=new Location(x,y);
				locationArray[i]=tmp;
			
		}
		
		return locationArray;

	}
	
	
	public static int[][] getRandomArray2DAliens(int maxValue, int dimSize) {
		Random tempRand = new Random();
		int temp = Math.abs(GameConfig.ALIEN_DISTANCE_FROM_SHIP_AT_START - maxValue);
		int[][] tempArray = new int[dimSize][dimSize];

		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < tempArray[i].length; j++) {
				int tempValue = tempRand.nextInt(temp) +GameConfig.ALIEN_DISTANCE_FROM_SHIP_AT_START;
				int tempValue2 = tempRand.nextInt(temp) + GameConfig.ALIEN_DISTANCE_FROM_SHIP_AT_START;
				while ((Math.abs(tempValue - tempValue2)) < GameConfig.ALIEN_MIN_DIFF_BETWEEN_COORDS) {
					tempValue2 = generateAnother(tempRand, temp) + GameConfig.ALIEN_DISTANCE_FROM_SHIP_AT_START;
				}
				tempArray[i][j] = tempValue;

			}

		}

		return tempArray;
	}
	
	
	public static int[][] getRandomArray2DMeteors(int maxValue, int dimSize) {
		Random tempRand = new Random();
		int temp = Math.abs(GameConfig.METEORS_DISTANCE_FROM_SHIP_AT_START - maxValue);
		int[][] tempArray = new int[dimSize][dimSize];

		for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < tempArray[i].length; j++) {
				int tempValue = tempRand.nextInt(temp) +GameConfig.METEORS_DISTANCE_FROM_SHIP_AT_START;
				int tempValue2 = tempRand.nextInt(temp) + GameConfig.METEORS_DISTANCE_FROM_SHIP_AT_START;
				while ((Math.abs(tempValue - tempValue2)) < GameConfig.METEORS_MIN_DIFF_BETWEEN_COORDS) {
					tempValue2 = generateAnother(tempRand, temp) + GameConfig.METEORS_DISTANCE_FROM_SHIP_AT_START;
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
