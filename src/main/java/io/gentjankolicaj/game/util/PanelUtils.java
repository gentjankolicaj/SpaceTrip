package io.gentjankolicaj.game.util;

import io.gentjankolicaj.game.globals.AppConfig;

import javax.swing.*;
import java.awt.*;


/**
 * @author gentjan kolicaj
 * 
 * 					
 */
public class PanelUtils {

	
	public static void changePanel(JFrame jFrame,JPanel oldPanel,JPanel gamePanel,JPanel infoPanel) {
		Container container=jFrame.getContentPane();
		container.remove(oldPanel);
		jFrame.setSize(new Dimension(AppConfig.WINDOW_WIDTH, AppConfig.WINDOW_HEIGHT));
		container.setLayout(new BorderLayout());
		container.add(gamePanel, BorderLayout.CENTER);
		container.add(infoPanel, BorderLayout.SOUTH);
		jFrame.repaint();

	}
}
