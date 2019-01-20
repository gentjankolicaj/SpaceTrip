package org.app.gui;

import javax.swing.JPanel;

import org.app.entities.general.LanguageType;
import org.app.globals.AppConfig;
import org.app.globals.AppStrings;
import org.app.util.PanelUtils;

import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;

public class StartPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -932527131206324423L;
	private JPanel instance;

	private JButton btnStart;
	private JButton btnClose;
	private JLabel lblApp;
	private JLabel lblGreeting;
	private JComboBox languageComboBox;
	private DefaultComboBoxModel<LanguageType> languageModel;

	private JFrame jFrame;

	public StartPanel(JFrame jFrame) {
		this.instance = this;
		this.jFrame = jFrame;

		setLayout(null);

		initComponents();

		initComponentString();

		addListeners();
	}

	private void initComponents() {
		lblApp = new JLabel("");
		lblApp.setFont(new Font("Arial", Font.BOLD, 16));
		lblApp.setHorizontalAlignment(SwingConstants.CENTER);
		lblApp.setBounds(180, 11, 217, 35);
		add(lblApp);

		lblGreeting = new JLabel("");
		lblGreeting.setFont(new Font("Arial", Font.PLAIN, 13));
		lblGreeting.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreeting.setBounds(155, 70, 292, 25);
		add(lblGreeting);

		JLabel lblShip = new JLabel("");
		lblShip.setIcon(new ImageIcon(StartPanel.class.getResource("/org/app/resources/icons/spaceship_4.png")));
		lblShip.setBounds(10, 221, 162, 82);
		add(lblShip);

		JLabel lblAlien = new JLabel("");
		lblAlien.setIcon(new ImageIcon(StartPanel.class.getResource("/org/app/resources/icons/alien_2.png")));
		lblAlien.setBounds(534, 11, 90, 120);
		add(lblAlien);

		btnStart = new JButton("");
		btnStart.setBounds(231, 142, 129, 27);
		add(btnStart);

		btnClose = new JButton("");
		btnClose.setBounds(231, 188, 129, 27);
		add(btnClose);

		languageComboBox = new JComboBox();
		languageComboBox.setBounds(252, 237, 108, 25);

		languageModel = new DefaultComboBoxModel();

		languageComboBox.setModel(languageModel);

		add(languageComboBox);
		
		JLabel lblFlag = new JLabel("");
		lblFlag.setIcon(new ImageIcon(StartPanel.class.getResource("/org/app/resources/icons/flag.png")));
		lblFlag.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFlag.setBounds(196, 232, 46, 35);
		add(lblFlag);
	}

	private void initComponentString() {
		LanguageType language = AppConfig.AppLanguage;
		lblApp.setText(AppStrings.applicationVersion);
		lblGreeting.setText(AppStrings.welcomeMessage.get(language).getContent());
		btnStart.setText(AppStrings.start.get(language).getContent());
		btnClose.setText(AppStrings.close.get(language).getContent());

		LanguageType[] array = LanguageType.values();
		for (LanguageType var : array) {
			languageModel.addElement(var);
		}

	}

	private void addListeners() {
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				InfoPanel infoPanel = new InfoPanel();
				GamePanel gamePanel = new GamePanel(infoPanel);

				//Panel change in JFrame.
				PanelUtils.changePanel(jFrame, instance, gamePanel, infoPanel);
				
				//Resquesting focus in this panel
				//IMPORTANT:Focus must be requested in order for KeypadListener to listen in gamePanel
				gamePanel.requestFocusInWindow();
				
				
			}
		});

		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		});

		languageComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Object objectSelected = languageComboBox.getSelectedItem();
				if (objectSelected != null) {
					LanguageType languageSelected = (LanguageType) objectSelected;
					AppConfig.AppLanguage = languageSelected;
					updateStrings();
				}

			}
		});
	}

	private void updateStrings() {
		LanguageType language = AppConfig.AppLanguage;
		lblApp.setText(AppStrings.applicationVersion);
		lblGreeting.setText(AppStrings.welcomeMessage.get(language).getContent());
		btnStart.setText(AppStrings.start.get(language).getContent());
		btnClose.setText(AppStrings.close.get(language).getContent());
	}
}
