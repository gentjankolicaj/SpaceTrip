package org.app.entities.game;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import org.app.entities.Location;
import org.app.globals.AppConfig;
import org.app.globals.GameConfig;


/**
 * 
 * @author-Gentjan_Kolicaj
 *
 */
public class SpaceShip extends Entity{
	
	private ArrayList<Missile> missiles;

	public SpaceShip(Location location, Image image) {
		super(location, image);
		this.missiles=new ArrayList<>();
	}

	public SpaceShip(Location location, String imagePath) {
		super(location, imagePath);
		this.missiles=new ArrayList<>();
	}

	public SpaceShip(Location location) {
		super(location);
		loadImage(GameConfig.SPACESHIP_1);
		this.missiles=new ArrayList<>();
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