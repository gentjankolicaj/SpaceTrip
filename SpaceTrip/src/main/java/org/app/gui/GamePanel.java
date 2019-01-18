package org.app.gui;

import javax.swing.JPanel;

import org.app.globals.AppConfig;


/**
 * 
 * @author gentjan kolicaj
 * 
 * 
 */
public class GamePanel extends JPanel{ 


	private static final long serialVersionUID = -727575640775966022L;
	private JPanel instance;
    private InfoPanel infoPanel;



	public GamePanel(InfoPanel infoPanel) {
    	this.instance=this;
    	this.infoPanel=infoPanel;
		setLayout(null);

	
	}

	


	
}