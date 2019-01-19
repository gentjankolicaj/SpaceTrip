package org.app.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.app.entities.Location;
import org.app.entities.MotionFunctionType;
import org.app.entities.game.Alien;
import org.app.entities.game.Meteor;
import org.app.entities.game.Missile;
import org.app.entities.game.SpaceShip;
import org.app.globals.AppConfig;
import org.app.globals.AppStrings;
import org.app.globals.GameConfig;
import org.app.listener.KeyboardListener;
import org.app.motion.Function;
import org.app.motion.FunctionFactory;

/**
 * 
 * @author gentjan kolicaj
 * 
 * 
 */
public class GamePanel extends JPanel implements Runnable{

	private static final long serialVersionUID = -727575640775966022L;
	private static final long INIT_TIME = System.currentTimeMillis();

	private JPanel instance;
	private InfoPanel infoPanel;
	private KeyboardListener keyboardListener;
	private Thread thread;

	private boolean inGame;
	private int lifes;
	private int gameLevel;
	private int dayQuoteIndex = new Random().nextInt(AppStrings.quotes.length);

	private String backgroundImage;
	private SpaceShip spaceShip;
	private List<Meteor> meteors;
	private List<Alien> aliens;
	private List<Missile> missiles;

	public GamePanel(InfoPanel infoPanel) {
		this.instance = this;
		setLayout(null);
		this.infoPanel = infoPanel;
		this.inGame = true;
		this.lifes = GameConfig.lifes;
		this.gameLevel = GameConfig.startLevel;
		this.backgroundImage = GameConfig.PLANET_ORDER[0].getImageResource();
		this.spaceShip=new SpaceShip(new Location(GameConfig.SPACESHIP_INIT_X,GameConfig.SPACESHIP_INIT_Y));
        this.keyboardListener=new KeyboardListener(spaceShip);

	    
		addKeyListener(keyboardListener);
		
		
		thread = new Thread(this);
		thread.start();

	}

	@Override
	public void run() {

		while (isInGame()) {

			moveSpaceShip();

			moveMissile();

			moveMeteor();

			moveAlien();

			checkEntityCollision();

			updateInfoLabels();

			//changeLevel();
			
			try {
				thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			repaint();

		}

	}

	private void updateInfoLabels() {
		// TODO Auto-generated method stub

	}

	private void checkEntityCollision() {
		// TODO Auto-generated method stub

	}

	private void moveAlien() {
		// TODO Auto-generated method stub

	}

	private void moveMeteor() {
		// TODO Auto-generated method stub

	}

	private void moveMissile() {
		List<Missile> list=spaceShip.getMissiles();
		for(Missile var:list) {
			Location tmp=var.getLocation();
			int updateX=tmp.getX()+GameConfig.missile_speed+1;
			tmp.setX(updateX);
		}

	}

	private void moveSpaceShip() {
	/*	Function<Location,Location> function=FunctionFactory.getMotionFunction(MotionFunctionType.X_Y0);
        Location tmp=spaceShip.getLocation();
        tmp.setX(tmp.getX()+3);
        spaceShip.setLocation(tmp);*/
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		paintMyComponents(g);
	}

	private void paintMyComponents(Graphics g) {
		paintBackground(g);
		if (isInGame()) {

			// paint space ship
			g.drawImage(spaceShip.getImage(),
					spaceShip.getLocation().getX(), spaceShip.getLocation().getY(), this);

			// paint missile
			List<Missile> list = spaceShip.getMissiles();
			if(list!=null)
			for (Missile var : list)
				if (var.isVisible()) {
					g.drawImage(var.getImage(),var.getLocation().getX(), var.getLocation().getY(), this);
				}

		}
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

	/**
	 * This method changes level.
	 */
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

	// ======================Print spaceship====================================
	private void paintSpaceShip() {

	}

	private void paintMissile() {

	}

}