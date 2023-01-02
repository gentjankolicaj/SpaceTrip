package io.gentjankolicaj.game.entities.game;


import java.net.URL;

/**
 * @author gentjan kolicaj
 */
public class Planet {

    private PlanetType type;
    private URL imageResource;

	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Planet(PlanetType type, URL imageResource) {
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

	public URL getImageResource() {
        return imageResource;
    }

    public void setImageResource(URL imageResource) {
        this.imageResource = imageResource;
    }
}
