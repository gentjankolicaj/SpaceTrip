package org.game.util;

import javax.swing.*;

/**
 * @author gentjan kolicaj
 * 
 * 					
 */
public class PopUp {

	public static void showMessage(JPanel panel, String message,String title) {
		JOptionPane.showMessageDialog(panel, message, title, 1);
	}


	public static String showQuestionBox(JPanel panel, String infoAboutPopUp,String question) {
		return JOptionPane.showInputDialog(panel, question, infoAboutPopUp);
	}
}
