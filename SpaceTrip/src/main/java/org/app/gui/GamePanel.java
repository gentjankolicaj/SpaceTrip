package org.app.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import org.app.entities.Location;
import org.app.entities.game.Alien;
import org.app.entities.game.Meteor;
import org.app.entities.game.Missile;
import org.app.entities.game.Planet;
import org.app.entities.game.SpaceShip;
import org.app.globals.AppConfig;
import org.app.globals.AppStrings;
import org.app.globals.GameConfig;
import org.app.listener.KeyboardListener;
import org.app.motion.AlienMotionFunctionType;
import org.app.motion.Function;
import org.app.motion.FunctionFactory;
import org.app.motion.MeteorMotionFunctionType;
import org.app.util.LocationUtils;


/**
 * 
 * @author gentjan kolicaj
 * 
 * 
 */
public class GamePanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = -727575640775966022L;
	private static final long INIT_TIME=System.currentTimeMillis();
	
	private JPanel instance;
	
	private InfoPanel infoPanel;
	private JLabel lblPoints;
	private JLabel lblLife;
	private JLabel lblTime;
	private JLabel lblAlien;
	private JLabel lblMeteor;
	private JLabel lblPlanet;
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblLevel;
	
	
	
	private KeyboardListener keyboardListener;
	private Timer timer;
	private Random random = new Random();

	private boolean inGame;
	private int lifes;
	private int gameLevel;
	private static int points;
    private Planet planet;
    private static int meteorHit;
    private static int alienHit;
    
	private int dayQuoteIndex = random.nextInt(AppStrings.quotes.length);

	private String backgroundImage;
	private SpaceShip spaceShip;
	private List<Meteor> meteors;
	private List<Alien> aliens;
	private List<Missile> missiles;
	private MeteorMotionFunctionType meteorMotionFunction;
	private AlienMotionFunctionType alienMotionFunction;

	public GamePanel(InfoPanel infoPanel) {
		this.instance = this;
		setLayout(null);
		this.infoPanel = infoPanel;

		setInitialState();

		this.keyboardListener = new KeyboardListener(spaceShip);

		addKeyListener(keyboardListener);

		timer=new Timer(GameConfig.EVENT_THROWING_DELAY,this);//This timer is going to throw event by a specific frequencies,than event is going to be handled by ActionListener
		timer.start();

	}


	
	public void run() {

		if (gameLevel >7) {
			try {

				Thread.sleep(10000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("===> Game close at level 8.");
			System.exit(1); // Shutdown program
		}

		removeUnusedEntities();

		moveSpaceShip();

		moveMissile();

		moveMeteor();

		moveAlien();

		try {

			checkEntityCollision();

		} catch (ConcurrentModificationException c) {
			c.printStackTrace();
		}

		updateInfoLabels();

		changeLevel();

		repaint();

	}

	private void updateInfoLabels() {
		    long elapsedTime=(System.currentTimeMillis()-INIT_TIME)/6000; //in seconds
		    
		    this.lblPoints.setText(""+points);
			this.lblLife.setText(""+lifes);
			this.lblTime.setText(""+elapsedTime);
		    this.lblAlien.setText(""+alienHit);
			this.lblMeteor.setText(""+meteorHit);
			this.lblPlanet.setText(planet.getType().getValue());
			this.lblX.setText(""+spaceShip.getLocation().getX());
			this.lblY.setText(""+spaceShip.getLocation().getY());
			this.lblLevel.setText(""+(gameLevel+1));
			
		

	}

	private void checkEntityCollision() throws ConcurrentModificationException{
		// Check for Meteor+Spaceship+Missile collision
		for (Meteor var : meteors) {
			if (var.getBounds().intersects(spaceShip.getBounds())) {
				this.lifes = this.lifes - 1;
				 meteors.remove(var);
				
				 if(lifes<0)
					 closeGame();
				
		      	}

			for (Missile miss : missiles) {
				if (miss.getBounds().intersects(var.getBounds())) {
					points = points + 1;
					meteorHit=meteorHit+1;
					meteors.remove(var);
					missiles.remove(miss);
				}
			}

		}

		// Check for Alien+Spaceship collision
		for (Alien var : aliens) {
			if (var.getBounds().intersects(spaceShip.getBounds()))
				this.lifes = this.lifes - 2;
			    if(lifes<0)
			    	closeGame();
		}

		// Check for Alien+Missile collision
		for (Missile var : missiles) {
			for (Alien al : aliens) {
				if (var.getBounds().intersects(al.getBounds())) {
					if (al.getStrength() > 0) {
						al.setStrength(al.getStrength() - 1);
						points = points + 2;
					} else {
						aliens.remove(al);
						points = points + 3;
						alienHit=alienHit+1;
					}

				}

			}
		}

	}

	private void moveAlien() {
		Function<Location, Location> function = FunctionFactory.getAlienFunction(alienMotionFunction);
		function.prepareFunction(new Integer(GameConfig.alienBumps)); //set number of bumps on screen
		for (Alien var : aliens) {
			function.calculate(var.getLocation());
		}

	}

	private void moveMeteor() {
		Function<Location, Location> function = FunctionFactory.getMeteorFunction(meteorMotionFunction);
		for (Meteor var : meteors) {
			function.calculate(var.getLocation());

		}

	}

	private void moveMissile() {
		missiles = spaceShip.getMissiles();
		for (Missile var : missiles) {
			Location tmp = var.getLocation();
			int updateX = tmp.getX() + GameConfig.missile_speed + 1;
			tmp.setX(updateX);
		}

	}

	private void moveSpaceShip() {
		/**
		 * Spaceship change of location is done in method keyPressed(...) at
		 * KeyboardListener
		 */
	}

	private boolean isInGame() {
		if (lifes > 0) {
			inGame = true;
			return inGame;
		} else {
			inGame = false;
			return inGame;
		}
	}

	private void setInitialState() {
		this.inGame = true;
		
        this.lblPoints=infoPanel.getPoints();
		this.lblLife=infoPanel.getLife();
		this.lblTime=infoPanel.getTime();
	    this.lblAlien=infoPanel.getAlien();
		this.lblMeteor=infoPanel.getMeteor();
		this.lblPlanet=infoPanel.getPlanet();
		this.lblX=infoPanel.getLblX();
		this.lblY=infoPanel.getLblY();
		this.lblLevel=infoPanel.getLblLevel();
		
		this.points=0;
		meteorHit=0;
		alienHit=0;
		this.planet=GameConfig.PLANET_ORDER[0];
		this.lifes = GameConfig.lifes;
		this.gameLevel = GameConfig.startLevel;
		
		
		this.backgroundImage = GameConfig.PLANET_ORDER[0].getImageResource();

		this.meteorMotionFunction = MeteorMotionFunctionType.X_Y0;
		this.alienMotionFunction = AlienMotionFunctionType.X_COSX;

		this.spaceShip = new SpaceShip(new Location(GameConfig.SPACESHIP_INIT_X, GameConfig.SPACESHIP_INIT_Y));
		this.meteors = new ArrayList<>();
		this.aliens = new ArrayList<>();

		// Creation of meteors for the fist time
		Location[] meteorLocationArray=LocationUtils.getRandomMeteorLocation(gameLevel);
		for (int m = 0; m < GameConfig.METEORS_PER_LEVEL[0]; m++) {
			Meteor meteor = new Meteor(meteorLocationArray[m]);
			meteor.setVisible(true);
			meteors.add(meteor);
		}

		Location[] alienLocationArray=LocationUtils.getRandomAlienLocation(gameLevel);
		for (int a = 0; a < GameConfig.ALIEN_PER_LEVEL[0]; a++) {
			Alien alien = new Alien(alienLocationArray[a]);
			alien.setVisible(true);
			aliens.add(alien);

		}

	}

	private void changeLevel() {
		if (GameConfig.NEXT_LEVEL_CONDITION[gameLevel] <= calculateConditions()) {
			++gameLevel;
			if (gameLevel <= GameConfig.PLANET_ORDER.length-1) {
				backgroundImage = GameConfig.PLANET_ORDER[gameLevel].getImageResource();
				meteors=createNewMeteors(gameLevel);
				aliens=createNewAliens(gameLevel);
				planet=GameConfig.PLANET_ORDER[gameLevel];
               
			} else {
				backgroundImage = GameConfig.END_IMAGE;
				inGame = false;
				spaceShip.setVisible(false);
				meteors.clear();
				aliens.clear();
				missiles.clear();
				planet=null;
			}
		}

	}

	private double calculateConditions() {
		return (getDestroyedMeteors() + (System.currentTimeMillis() - INIT_TIME) / 6000L)
				* GameConfig.NEXT_LEVEL_COEF[gameLevel];
	}

	private int getDestroyedMeteors() {
		return meteorHit;

	}

	// ==================================================================================================
	// ============================= GamePanel component paint===========================================
	// ==================================================================================================

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintBackground(g);
		if (isInGame()) {
			paintSpaceShip(g);
			paintMissile(g);
			paintMeteors(g);
			paintAliens(g);
		}
	}

	private void paintBackground(Graphics g) {
		if (isInGame()) {
			paintBackground(g, gameLevel);
		} else {
			paintQuoteOfDay(g);
		}

	}

	private void paintBackground(Graphics g, int gameLevel) {
		g.drawImage(new ImageIcon(getClass().getResource(backgroundImage)).getImage(), 0, 0, AppConfig.GAME_PANEL_WIDTH,
				AppConfig.GAME_PANEL_HEIGHT, this);

	}

	private void paintQuoteOfDay(Graphics g) {
		Font quoteString = new Font("ARIAL", Font.BOLD, 27);
		FontMetrics fs = getFontMetrics(quoteString);
		g.setColor(Color.BLACK);
		g.setFont(quoteString);
		g.drawString("QOUTE OF THE DAY:",
				(AppConfig.GAME_PANEL_WIDTH
						- fs.stringWidth(AppStrings.gameOver.get(AppConfig.AppLanguage).getContent()) - 30) / 2,
				AppConfig.GAME_PANEL_HEIGHT / 5);

		Font quote = new Font("ARIAL", Font.ROMAN_BASELINE, 19);
		FontMetrics fM = getFontMetrics(quote);
		g.setColor(Color.BLACK);
		g.setFont(quote);
		g.drawString("\"" + AppStrings.quotes[dayQuoteIndex] + "\"",
				(AppConfig.GAME_PANEL_WIDTH - fM.stringWidth(AppStrings.quotes[dayQuoteIndex]) - 30) / 2,
				(int) (AppConfig.GAME_PANEL_HEIGHT - AppConfig.GAME_PANEL_HEIGHT * 0.7));
		

	}

	private void paintSpaceShip(Graphics g) {
		// Paints spaceship image into GamePanel
		g.drawImage(spaceShip.getImage(), spaceShip.getLocation().getX(), spaceShip.getLocation().getY(), this);

	}

	private void paintMissile(Graphics g) {
		// Paints missile image into GamePanel
		missiles = spaceShip.getMissiles();
		if (missiles != null)
			for (Missile var : missiles) {
				if (var.isVisible())
					g.drawImage(var.getImage(), var.getLocation().getX(), var.getLocation().getY(), this);
			}
	}

	private void paintMeteors(Graphics g) {
		// Paints meteor image into GamePanel
		if (meteors != null)
			for (Meteor var : meteors) {
				if (var.isVisible())
					g.drawImage(var.getImage(), var.getLocation().getX(), var.getLocation().getY(), this);
			}

	}

	private void paintAliens(Graphics g) {
		// Paints alien image into GamePanel
		if (aliens != null)
			for (Alien var : aliens) {
				if (var.isVisible())
					g.drawImage(var.getImage(), var.getLocation().getX(), var.getLocation().getY(), this);
			}

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		//1.Timer throws an event at this panel with a frequency of GameConfig.EVENT_THROWING_DELAY
		//2.Event thrown by timer causes this method of listener to be called 
		//3.As a result,run method of game is called.
		run(); 
		
	}
	
	
	
	//==============================================================================================
	//============================ some util methods ===============================================
	private void removeUnusedMissiles() {
        List<Missile> list=spaceShip.getMissiles();
		for(Missile var:list) {
			if(var.getLocation().getX()>AppConfig.GAME_PANEL_WIDTH) {
				list.remove(var);
			}
		}
	}

	private void removeUnusedMeteors() {
		for(Meteor var:meteors) {
			if(var.getLocation().getX()<-80) {
				meteors.remove(var);
			}
		}

	}
	
	private void removeUnusedAliens() {
		for(Alien var:aliens) {
			if(var.getLocation().getX()<-80) {
				aliens.remove(var);
				this.lifes=this.lifes-2;
			}
		}

	}


	private void removeUnusedEntities() {
		try {

			removeUnusedMissiles();
			removeUnusedMeteors();
			removeUnusedAliens();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private List<Meteor> createNewMeteors(int gameLevel) {
		List<Meteor> list=new ArrayList<>();
		Location[] meteorLocationArray=LocationUtils.getRandomMeteorLocation(gameLevel);
		for (int m = 0; m < GameConfig.METEORS_PER_LEVEL[gameLevel]; m++) {
			Meteor meteor = new Meteor(meteorLocationArray[m]);
			meteor.setVisible(true);
			list.add(meteor);
		}
		return list;
		
	}
	
	private List<Alien> createNewAliens(int gameLevel) {
		List<Alien> list=new ArrayList<>();
		Location[] alienLocationArray=LocationUtils.getRandomAlienLocation(gameLevel);
		for (int a = 0; a < GameConfig.ALIEN_PER_LEVEL[gameLevel]; a++) {
			Alien alien = new Alien(alienLocationArray[a]);
			alien.setVisible(true);
			list.add(alien);

		}
		
		return list;
	}
	
	
	private void closeGame() {
		updateInfoLabels();
		repaint();
		
			try {
				
				Thread.sleep(10000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.exit(1); //Close program 
		
	}
	


}