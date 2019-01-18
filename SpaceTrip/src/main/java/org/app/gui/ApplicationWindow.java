package org.app.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

import org.app.globals.AppConfig;
import org.app.globals.AppStrings;

/**
 * 
 * @author gentjan kolicaj
 * 
 * 
 */
public class ApplicationWindow extends JFrame {

	private static final long serialVersionUID = -7116512274697755254L;
	private JFrame instance;
	private StartPanel startPanel;

	public ApplicationWindow() {
		this.instance = this;
		startPanel = new StartPanel(this);

		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		container.add(startPanel, BorderLayout.CENTER);

		pack();
		setTitle(AppStrings.applicationVersion);
		setSize(new Dimension(AppConfig.START_PANEL_WIDTH, AppConfig.START_PANEL_HEIGHT));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}