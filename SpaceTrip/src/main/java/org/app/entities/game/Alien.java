package org.app.entities.game;

import java.awt.Image;

import org.app.entities.Location;

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
		this.strength=3;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}


	

}
