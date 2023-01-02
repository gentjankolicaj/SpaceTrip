package io.gk.game;

import io.gk.game.gui.ApplicationWindow;

import java.awt.*;

/**
 * @author gentjan kolicaj
 */
public class Application {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ApplicationWindow();

			}
		});
	}
}
