package org.game.entities.game;

import org.game.entities.Location;
import org.game.globals.GameConfig;

import java.awt.*;
import java.net.URL;

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

	public Meteor(Location location, URL imagePath) {
		super(location, imagePath);
		// TODO Auto-generated constructor stub
	}

	public Meteor(Location location) {
		super(location);
		loadImage(GameConfig.METEOR_IMAGE);
	}


}