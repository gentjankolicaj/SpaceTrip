package org.app.util;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.app.globals.AppConfig;

public class PanelUtils {

	
	public static void changePanel(JFrame jFrame,JPanel oldPanel,JPanel gamePanel,JPanel infoPanel) {
		Container container=jFrame.getContentPane();
		container.remove(oldPanel);
		container.setSize(new Dimension(AppConfig.WINDOW_WIDTH, AppConfig.WINDOW_HEIGHT));
		container.setLayout(new BorderLayout());
		container.add(gamePanel, BorderLayout.CENTER);
		container.add(infoPanel, BorderLayout.SOUTH);
		jFrame.repaint();

	}
}