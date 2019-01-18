package org.app.globals;

import org.app.entities.game.Planet;
import org.app.entities.game.PlanetType;

public class GameConfig {
	
	
	//Game configs
	public static int lifes=10;
	public static int startLevel=1;
	
	
	
	
	//Speed config
	public static int meteor_speed=1;
	public static int spaceship_speed = 1;
	public static int missile_speed= 2;
	public static int alien_speed= 2;
	
	
	//Meteor config
	public static int meteor_x=1;
	public static int meteor_y1;

	
	
	//Spaceship config
	public static final int SPACESHIP_INIT_X=0;
	public static final int SPACESHIP_INIT_Y=AppConfig.GAME_PANEL_HEIGHT/2;
	
	public static final String SPACESHIP_1="/org/app/resources/icons/spaceship_1.png";
    public static final String SPACESHIP_2="/org/app/resources/icons/spaceship_2.png";
	public static final String SPACESHIP_3="/org/app/resources/icons/spaceship_3.png";
	public static final String SPACESHIP_4="/org/app/resources/icons/spaceship_4.png";

	public static final String MISSILE="/org/app/resources/icons/missile.png";

	
	
	
	
	
	
	

			
		
	//alien config
	public static int alien_x=1;
	public static int alien_y=1;
	
	
	
	
	public static final double[] NEXT_LEVEL_CONDITION = { 28, 30, 30, 30, 30, 30, 30, 30 };
	
	public static final double[] NEXT_LEVEL_COEF = { 1, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2 };
	
	public static final int [] METEORS_PER_LEVEL= { 230, 245, 255, 262, 276, 285, 345, 374 };
	
	
	public static final Planet[] PLANET_ORDER = { 
			new Planet(PlanetType.MERCURY,"/org/app/resources/icons/Mercury.jpg"),
			new Planet(PlanetType.VENUS,"/org/app/resources/icons/Venus.jpg"),
			new Planet(PlanetType.EARTH,"/org/app/resources/icons/Earth.jpg"),
			new Planet(PlanetType.MOON, "/org/app/resources/icons/Moon.jpg"),
			new Planet(PlanetType.MARS,"/org/app/resources/icons/Mars.jpg"),
			new Planet(PlanetType.JUPITER,"/org/app/resources/icons/Jupiter.jpg"),
			new Planet(PlanetType.SATURN, "/org/app/resources/icons/Saturn.jpg"),
			new Planet(PlanetType.URANUS,"/org/app/resources/icons/Uranus.jpg" )};
	
	
	public static final String END_IMAGE = "/org/app/resources/End.jpg";
	
	




	
	
}
