package org.app.entities.game;

import java.awt.Image;

import org.app.entities.Location;
import org.app.globals.GameConfig;

/**
 * 
 * @author gentjan kolicaj
 * 
 */
public class Missile extends Entity {

	public Missile(Location location, Image image) {
		super(location, image);
	     
	}

	public Missile(Location location, String imagePath) {
		super(location, imagePath);
		
	}

	public Missile(Location location) {
		super(location);
		 loadImage(GameConfig.MISSILE_IMAGE);
	}

	
}
