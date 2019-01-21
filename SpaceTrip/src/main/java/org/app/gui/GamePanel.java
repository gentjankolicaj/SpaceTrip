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

/**
 * 
 * @author gentjan kolicaj
 * 
 * 
 */
public class GamePanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = -727575640775966022L;
	private static final long INIT_TIME = System.currentTimeMillis();

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
	private int points;
	private long time;
    private Planet planet;
    
	private int dayQuoteIndex = random.nextInt(AppStrings.quotes.length);

	private String backgroundImage;
	private SpaceShip spaceShip;
	private volatile List<Meteor> meteors;
	private volatile List<Alien> aliens;
	private volatile List<Missile> missiles;
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

			moveSpaceShip();

			moveMissile();

			moveMeteor();

			moveAlien();

			try {
				
			checkEntityCollision();
			
			}catch(ConcurrentModificationException c) {
				c.printStackTrace();
			}

			updateInfoLabels();

			// changeLevel();

			repaint();

		

	}

	private void updateInfoLabels() {
		    long elapsedTime=(System.currentTimeMillis()-time)/6000; //in seconds
		    
		    this.lblPoints.setText(""+points);
			this.lblLife.setText(""+lifes);
			this.lblTime.setText(""+elapsedTime);
		    this.lblAlien.setText(""+aliens.size());
			this.lblMeteor.setText(""+meteors.size());
			this.lblPlanet.setText(planet.getType().getValue());
			this.lblX.setText(""+spaceShip.getLocation().getX());
			this.lblY.setText(""+spaceShip.getLocation().getY());
			this.lblLevel.setText(""+gameLevel);
			
		

	}

	private void checkEntityCollision() throws ConcurrentModificationException{
		// Check for Meteor+Spaceship+Missile collision
			for (Meteor var : meteors) {
				if (var.getBounds().intersects(spaceShip.getBounds()))
					this.lifes = this.lifes - 1;

				for (Missile miss : missiles) {
					if (miss.getBounds().intersects(var.getBounds())) {
						meteors.remove(var);
						missiles.remove(miss);
					}
				}

			}

		

		// Check for Alien+Spaceship collision
		for (Alien var : aliens) {
			if (var.getBounds().intersects(spaceShip.getBounds()))
				this.lifes = this.lifes - 2;
		}

		// Check for Alien+Missile collision
		for (Missile var : missiles) {
			for (Alien al : aliens) {
				if (var.getBounds().intersects(al.getBounds())) {
					if (al.getStrength() > 0)
						al.setStrength(al.getStrength() - 1);
					else
						aliens.remove(al);

				}

			}
		}

	}

	private void moveAlien() {
		Function<Location, Location> function = FunctionFactory.getAlienFunction(alienMotionFunction);
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
		if (lifes >= 0) {
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
		this.planet=GameConfig.PLANET_ORDER[0];
		this.time=System.currentTimeMillis();
		this.lifes = GameConfig.lifes;
		this.gameLevel = GameConfig.startLevel;
		
		
		this.backgroundImage = GameConfig.PLANET_ORDER[0].getImageResource();

		this.meteorMotionFunction = MeteorMotionFunctionType.X_Y0;
		this.alienMotionFunction = AlienMotionFunctionType.X_COSX;

		this.spaceShip = new SpaceShip(new Location(GameConfig.SPACESHIP_INIT_X, GameConfig.SPACESHIP_INIT_Y));
		this.meteors = new ArrayList<>();
		this.aliens = new ArrayList<>();

		// Creation of meteors for the fist time
		for (int m = 0; m < GameConfig.METEORS_PER_LEVEL[0]; m++) {
			Meteor meteor = new Meteor(
					new Location(GameConfig.METEOR_INIT_X+random.nextInt(25), random.nextInt(GameConfig.METEOR_INIT_Y)));
			meteor.setVisible(true);
			meteors.add(meteor);
		}

		// Creation of aliens for the fist time
		for (int a = 0; a < GameConfig.ALIEN_PER_LEVEL[0]; a++) {
			Alien alien = new Alien(
					new Location(GameConfig.ALIEN_INIT_X+random.nextInt(25), random.nextInt(GameConfig.ALIEN_INIT_Y)),
					GameConfig.ALIEN_IMAGE_1);
			alien.setVisible(false);
			aliens.add(alien);

		}

	}

	private void changeLevel() {
		if (GameConfig.NEXT_LEVEL_CONDITION[gameLevel] <= calculateConditions()) {
			++gameLevel;
			if (gameLevel < GameConfig.PLANET_ORDER.length) {
				backgroundImage = GameConfig.PLANET_ORDER[gameLevel].getImageResource();

			} else {
				backgroundImage = GameConfig.END_IMAGE;
				inGame = false;
				spaceShip.setVisible(false);
				meteors.clear();
				aliens.clear();
				missiles.clear();
			}
		}

	}

	private double calculateConditions() {
		return (getDestroyedMeteors() + (System.currentTimeMillis() - INIT_TIME) / 6000L)
				* GameConfig.NEXT_LEVEL_COEF[gameLevel];
	}

	private int getDestroyedMeteors() {
		return GameConfig.METEORS_PER_LEVEL[gameLevel] - meteors.size();

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
	
	
	

}