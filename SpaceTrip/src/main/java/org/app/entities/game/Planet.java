package org.app.entities.game;


/**
 * @author gentjan kolicaj
 * 
 * 					
 */
public class Planet {

	private PlanetType type;
	
	private String imageResource;

	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Planet(PlanetType type, String imageResource) {
		super();
		this.type = type;
		this.imageResource = imageResource;
	}

	public PlanetType getType() {
		return type;
	}

	public void setType(PlanetType type) {
		this.type = type;
	}

	public String getImageResource() {
		return imageResource;
	}

	public void setImageResource(String imageResource) {
		this.imageResource = imageResource;
	}
	
	
}
