package org.game.gui;

import org.game.globals.AppConfig;
import org.game.globals.AppStrings;

import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author gentjan kolicaj
 * 
 * 
 */
public class ApplicationWindow extends JFrame {

    private static final long serialVersionUID = -7116512274697755254L;
    private final StartPanel startPanel;

	public ApplicationWindow() {
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