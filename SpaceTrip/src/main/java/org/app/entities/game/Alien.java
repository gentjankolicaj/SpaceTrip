package org.app.entities.game;

import java.awt.Image;

import org.app.entities.Location;
import org.app.globals.GameConfig;

/**
 * @author gentjan kolicaj
 */
public class Alien extends Entity {
	
	private int strength;

	public Alien(Location location, Image image) {
		super(location, image);
		this.strength=3;
	}

	public Alien(Location location, String imagePath) {
		super(location, imagePath);
		this.strength=3;
	}

	public Alien(Location location) {
		super(location);
		loadImage(GameConfig.ALIEN_IMAGE_1);
		this.strength=3;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}


	

}
