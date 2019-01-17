package org.app.gui;

import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * 
 * @author gentjan kolicaj
 * 
 * 
 */
public class GamePanel extends JPanel{ 

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = -727575640775966022L;


	private JLabel earnedPoints;
	private JLabel lifePoints;
	private JLabel elapsedTime;
	private JLabel planetLabel;
	private JLabel fireCount;
	private JLabel meteorsHit;
	private JLabel aliensHit;
	private JLabel coordinateX;
	private JLabel coordinateY;
	private JLabel shipSpeed;

	
	public GamePanel(JLabel earnedPoints, JLabel lifePoints, JLabel elapsedTime, JLabel planetLabel, JLabel fireCount,
			JLabel meteorsHit, JLabel aliensHit, JLabel coordinateX, JLabel coordinateY, JLabel shipSpeed) {
		this.earnedPoints = earnedPoints;
		this.lifePoints = lifePoints;
		this.elapsedTime = elapsedTime;
		this.planetLabel = planetLabel;
		this.fireCount = fireCount;
		this.meteorsHit = meteorsHit;
		this.aliensHit = aliensHit;
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.shipSpeed = shipSpeed;

	
	}

	


	
}