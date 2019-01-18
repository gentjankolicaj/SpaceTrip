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
	     loadImage(GameConfig.MISSILE);
	     
	}

	public Missile(Location location, String imagePath) {
		super(location, imagePath);
		// TODO Auto-generated constructor stub
	}

	public Missile(Location location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	
   public void move() {
		
	}

	
}
