package org.app.entities.game;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import org.app.entities.Location;

/**
 * 
 * @author gentjan kolicaj
 * 
 */
public class Entity {

	protected boolean visible;
	protected Location location;
	protected Image image;
	protected String imagePath;
	protected int width;
	protected int height;

	public Entity(Location location) {
		super();
	    this.location=location;
		this.visible = true;
	}
	
	public Entity(Location location,String imagePath) {
		super();
		 this.location=location;
		this.imagePath=imagePath;
		this.visible = true;
		
		loadImage(imagePath);
	}
	
	public Entity(Location location,Image image) {
		super();
		this.image=image;
		this.visible = true;
		
		setImageDimensions();
	}

	public void setImageDimensions() {
		width = image.getWidth(null);
		height = image.getHeight(null);
	}

	public void loadImage(String imagePath) {
		ImageIcon temp = new ImageIcon(getClass().getResource(imagePath));
		image = temp.getImage();
		setImageDimensions();
	}


	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	

	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public Rectangle getBounds() {
		return new Rectangle(location.getX(),location.getY(), width, height);
	}
	
}
