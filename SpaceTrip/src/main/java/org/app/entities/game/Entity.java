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

	protected boolean visibility;
	protected Location location;
	protected Image image;
	protected String imagePath;
	protected int width;
	protected int height;

	public Entity(Location location) {
		super();
	    this.location=location;
		this.visibility = true;
		
	}
	
	
	public Entity(Location location,String imagePath) {
		super();
		 this.location=location;
		this.imagePath=imagePath;
		this.visibility=true;
		
		loadImage(imagePath);
		
		setImageDimensions();
	
	}
	
	public Entity(Location location,Image image) {
		super();
		this.image=image;
		this.visibility=true;
		
		setImageDimensions();
	
	}

	private void setImageDimensions() {
		width = image.getWidth(null);
		height = image.getHeight(null);
	}

	private void loadImage(String imagePath) {
		ImageIcon temp = new ImageIcon(getClass().getResource(imagePath));
		image = temp.getImage();
	}

	
	
	
	public boolean isVisibility() {
		return visibility;
	}


	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
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


	public Rectangle getBounds() {
		return new Rectangle(location.getX(),location.getY(), width, height);
	}
	
	protected void move() {
		
	}
}
