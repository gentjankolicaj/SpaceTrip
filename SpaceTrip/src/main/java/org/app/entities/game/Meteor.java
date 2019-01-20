package org.app.entities.game;

import java.awt.Image;

import org.app.entities.Location;
import org.app.globals.GameConfig;

/**
 * 
 * @author gentjan kolicaj
 * 
 */
public class Meteor extends Entity {

	
	public Meteor(Location location, Image image) {
		super(location, image);
		// TODO Auto-generated constructor stub
	}

	public Meteor(Location location, String imagePath) {
		super(location, imagePath);
		// TODO Auto-generated constructor stub
	}

	public Meteor(Location location) {
		super(location);
		loadImage(GameConfig.METEOR_IMAGE);
	}


}