package org.app.main;

import java.awt.EventQueue;

import org.app.gui.ApplicationWindow;



/**
 * 
 * @author gentjan kolicaj
 * 
 * 
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
