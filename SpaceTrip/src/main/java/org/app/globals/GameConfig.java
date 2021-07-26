package org.app.globals;

import org.app.entities.game.Planet;
import org.app.entities.game.PlanetType;
import org.app.motion.AlienMotionFunction;
import org.app.motion.AlienMotionFunctionType;
import org.app.motion.MeteorMotionFunction;
import org.app.motion.MeteorMotionFunctionType;

public class GameConfig {
	
	
	//Game configs
	public static final int LIFES=25;
	public static final int START_LEVEL=0;
	public static final int GAME_THREAD_SLEEP_TIME=50;
	
	
	//Initial speed configs for entities
	public static int meteor_speed=1;
	public static int spaceship_speed = 6;
	public static int missile_speed= 9;
	public static int alien_speed= 12;
    public static int alienBumps=2;
	
    public static MeteorMotionFunctionType MMF = MeteorMotionFunctionType.X_Y0;
	public static AlienMotionFunctionType AMF= AlienMotionFunctionType.X_COSX;
	
    
	//Meteor initial location config
	public static final int METEOR_INIT_X=AppConfig.GAME_PANEL_WIDTH+10;
	public static final int METEOR_INIT_Y=AppConfig.GAME_PANEL_HEIGHT;
	public static final String METEOR_IMAGE="/org/app/resources/icons/meteor.png";
	public static final int METEORS_DISTANCE_FROM_SHIP_AT_START = 170; //for generating meteor coordinates random
	public static final int METEORS_MIN_DIFF_BETWEEN_COORDS = 120;    //for generating meteor coordinates random
	
	
	
	//Alien initial location config
    public static final int ALIEN_INIT_X=AppConfig.GAME_PANEL_WIDTH+10;
    public static final int ALIEN_INIT_Y=AppConfig.GAME_PANEL_HEIGHT;
    public static final int ALIEN_DISTANCE_FROM_SHIP_AT_START = 930;
    public static final int ALIEN_MIN_DIFF_BETWEEN_COORDS = 120; 
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

	
	//Missile config
	public static final String MISSILE_IMAGE="/org/app/resources/icons/missile.png";
	
	

	
	//Some game level configs
	public static final double[] NEXT_LEVEL_CONDITION = { 50,55,60,65,70,75,80,85};
	
	public static final double[] NEXT_LEVEL_COEF = { 1, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2 };
	
	public static final int [] METEORS_PER_LEVEL= { 430, 455, 475, 492, 526, 535, 545, 604 };
	
	public static final int [] ALIEN_PER_LEVEL= { 6,8, 10, 12, 14, 16, 18, 20};
	
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
