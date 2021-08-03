package org.game;

import org.game.gui.ApplicationWindow;

import java.awt.*;

/**
 * 
 * @author gentjan kolicaj
 * 						
 */
public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ApplicationWindow();

			}
		});

	}

}
