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