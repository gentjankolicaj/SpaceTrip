package org.app.entities.game;

import java.awt.Image;
import java.util.ArrayList;

import org.app.entities.Location;
import org.app.globals.GameConfig;


/**
 * 
 * @author-Gentjan_Kolicaj
 *
 */
public class SpaceShip extends Entity {
	
	private ArrayList<Missile> missiles;

	public SpaceShip(Location location, Image image) {
		super(location, image);
		// TODO Auto-generated constructor stub
	}

	public SpaceShip(Location location, String imagePath) {
		super(location, imagePath);
		// TODO Auto-generated constructor stub
	}

	public SpaceShip(Location location) {
		super(location);
		loadImage(GameConfig.SPACESHIP_1);
	}

	
    public void move() {
		
	}
    
    
    public void fire() {
		missiles.add(new Missile(new Location(location.getX() + width, location.getY() + height / 2)));
	}

	public ArrayList<Missile> getMissiles() {
		return missiles;
	}

}