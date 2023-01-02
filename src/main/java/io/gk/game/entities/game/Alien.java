package io.gk.game.entities.game;

import io.gk.game.entities.Location;
import io.gk.game.globals.GameConfig;

import java.awt.*;
import java.net.URL;

/**
 * @author gentjan kolicaj
 */
public class Alien extends Entity {
	
	private int strength;

	public Alien(Location location, Image image) {
		super(location, image);
		this.strength=3;
	}

	public Alien(Location location, URL imagePath) {
		super(location, imagePath);
		this.strength = 3;
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
