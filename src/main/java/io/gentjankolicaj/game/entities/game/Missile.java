package io.gentjankolicaj.game.entities.game;

import io.gentjankolicaj.game.entities.Location;
import io.gentjankolicaj.game.globals.GameConfig;

import java.awt.*;
import java.net.URL;

/**
 * 
 * @author gentjan kolicaj
 * 
 */
public class Missile extends Entity {

	public Missile(Location location, Image image) {
		super(location, image);
	     
	}

	public Missile(Location location, URL imagePath) {
		super(location, imagePath);

	}

	public Missile(Location location) {
		super(location);
		 loadImage(GameConfig.MISSILE_IMAGE);
	}

	
}
