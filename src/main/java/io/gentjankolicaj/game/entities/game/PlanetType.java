package io.gentjankolicaj.game.entities.game;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public enum PlanetType {
	
	EARTH("EARTH"), MOON("MOON"), VENUS("VENUS"), MARS("MARS"), MERCURY("MERCURY"), SATURN("SATURN"), JUPITER("JUPITER"), URANUS("URANUS");

    private final String value;

    PlanetType(String value) {
        this.value = value;
    }
	
	public String getValue() {
		return value;
	}
}
