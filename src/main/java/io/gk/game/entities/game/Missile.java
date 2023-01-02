package io.gk.game.entities.game;

import io.gk.game.entities.Location;
import io.gk.game.globals.GameConfig;

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
