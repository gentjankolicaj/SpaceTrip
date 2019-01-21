package org.app.util;

import org.app.entities.Location;
import org.app.globals.GameConfig;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class LocationUtils {
	
	
	public static Location[] getRandomMeteorLocation(int gameLevel) {
		Location[] locationArray=new Location[GameConfig.METEORS_PER_LEVEL[gameLevel]];
		int [][] coordinates=CalculationUtils.getRandomArray2D(1500, GameConfig.METEORS_PER_LEVEL[gameLevel]);
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
		int [][] coordinates=CalculationUtils.getRandomArray2D(1500, GameConfig.ALIEN_PER_LEVEL[gameLevel]);
		for(int i=0;i<coordinates.length;i++) {
				int x=coordinates[i][0];
				int y=coordinates[i][1];
				Location tmp=new Location(x,y);
				locationArray[i]=tmp;
			
		}
		
		return locationArray;

	}

}
