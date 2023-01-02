package io.gk.game.entities.game;

import io.gk.game.entities.Location;
import io.gk.game.globals.GameConfig;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;


/**
 * 
 * @author gentjan kolicaj
 *
 */
public class SpaceShip extends Entity{

	private final ArrayList<Missile> missiles;

	public SpaceShip(Location location, Image image) {
		super(location, image);
		this.missiles=new ArrayList<>();
	}

	public SpaceShip(Location location, URL imagePath) {
		super(location, imagePath);
		this.missiles = new ArrayList<>();
	}

	public SpaceShip(Location location) {
		super(location);
		loadImage(GameConfig.SPACESHIP_IMAGE_1);
		this.missiles=new ArrayList<>();
	}
    
    
    public void fire() {
		missiles.add(new Missile(new Location(location.getX() + width, location.getY() + height / 2)));
	}

	public ArrayList<Missile> getMissiles() {
		return missiles;
	}
	
}