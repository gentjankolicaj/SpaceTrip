package org.app.util;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
