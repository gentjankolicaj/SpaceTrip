package org.app.globals;

import org.app.entities.game.Planet;
import org.app.entities.game.PlanetType;

public class GameConfig {
	
	
	//Game configs
	public static int lifes=10;
	public static int startLevel=1;
	
	
	
	
	//Initial speed configs for entities
	public static int meteor_speed=1;
	public static int spaceship_speed = 6;
	public static int missile_speed= 9;
	public static int alien_speed= 15;
	
	
	
	
	//Meteor initial location config
	public static final int METEOR_INIT_X=AppConfig.GAME_PANEL_WIDTH+10;
	public static final int METEOR_INIT_Y=AppConfig.GAME_PANEL_HEIGHT;
	public static final String METEOR_IMAGE="/org/app/resources/icons/meteor.png";
	
	//Alien initial location config
    public static final int ALIEN_INIT_X=AppConfig.GAME_PANEL_WIDTH+10;
    public static final int ALIEN_INIT_Y=AppConfig.GAME_PANEL_HEIGHT;
    public static final String ALIEN_IMAGE_1="/org/app/resources/icons/alien_1.png";
    public static final String ALIEN_IMAGE_2="/org/app/resources/icons/alien_2.png";
    public static final String ALIEN_IMAGE_3="/org/app/resources/icons/alien_3.png";
	
    
    
    
    
	//Spaceship config
	public static final int SPACESHIP_INIT_X=0;
	public static final int SPACESHIP_INIT_Y=AppConfig.GAME_PANEL_HEIGHT/2;
	
	public static final String SPACESHIP_IMAGE_1="/org/app/resources/icons/spaceship_1.png";
    public static final String SPACESHIP_IMAGE_2="/org/app/resources/icons/spaceship_2.png";
	public static final String SPACESHIP_IMAGE_3="/org/app/resources/icons/spaceship_3.png";
	public static final String  SPACESHIP_IMAGE_4="/org/app/resources/icons/spaceship_4.png";

	public static final String MISSILE_IMAGE="/org/app/resources/icons/missile.png";
	
	
	
	
	
	
	public static final double[] NEXT_LEVEL_CONDITION = { 28, 30, 30, 30, 30, 30, 30, 30 };
	
	public static final double[] NEXT_LEVEL_COEF = { 1, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2 };
	
	public static final int [] METEORS_PER_LEVEL= { 50, 62, 73, 81, 97, 104, 111,123 };
	
	public static final int [] ALIEN_PER_LEVEL= { 2, 4, 6, 7, 9, 11, 13, 15 };

	
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
