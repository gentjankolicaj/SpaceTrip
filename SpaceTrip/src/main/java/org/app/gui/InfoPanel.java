package org.app.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.app.entities.general.LanguageType;
import org.app.globals.AppConfig;
import org.app.globals.AppStrings;

public class InfoPanel extends JPanel {

	private JPanel instance;
	private JLabel lblPoints;
	private JLabel lblLife;
	private JLabel lblTime;
	private JLabel lblAlien;
	private JLabel lblMeteor;
	private JLabel lblPlanet;
	private JLabel planet;
	private JLabel meteor;
	private JLabel alien;
	private JLabel time;
	private JLabel life;
	private JLabel points;

	public InfoPanel() {
		this.instance = this;

	}

	private void initInfoPanelComponents() {

		LanguageType language = AppConfig.AppLanguage;

		setPreferredSize(new Dimension(AppConfig.INFO_PANEL_WIDTH, AppConfig.INFO_PANEL_HEIGHT));
		setBackground(new Color(250, 250, 250));

		setLayout(null);

		lblPoints = new JLabel(AppStrings.points.get(language).getContent());
		lblPoints.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPoints.setBounds(10, 11, 78, 18);
		add(lblPoints);

		lblLife = new JLabel(AppStrings.life.get(language).getContent());
		lblLife.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLife.setBounds(10, 40, 78, 18);
		add(lblLife);

		lblTime = new JLabel(AppStrings.time.get(language).getContent());
		lblTime.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTime.setBounds(10, 70, 78, 18);
		add(lblTime);

		points = new JLabel("");
		points.setBounds(106, 11, 68, 18);
		add(points);

		life = new JLabel("");
		life.setBounds(106, 40, 68, 18);
		add(life);

		time = new JLabel("");
		time.setBounds(106, 70, 68, 18);
		add(time);

		lblAlien = new JLabel("Alien :");
		lblAlien.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAlien.setBounds(286, 11, 125, 18);
		add(lblAlien);

		lblMeteor = new JLabel("Meteor :");
		lblMeteor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMeteor.setBounds(286, 40, 125, 18);
		add(lblMeteor);

		lblPlanet = new JLabel("Planet :");
		lblPlanet.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPlanet.setBounds(286, 70, 125, 18);
		add(lblPlanet);

		alien = new JLabel("");
		alien.setBounds(421, 11, 68, 18);
		add(alien);

		meteor = new JLabel("");
		meteor.setBounds(421, 40, 68, 18);
		add(meteor);

		planet = new JLabel("");
		planet.setBounds(421, 70, 68, 18);
		add(planet);

	}

	public JPanel getInstance() {
		return instance;
	}

	public void setInstance(JPanel instance) {
		this.instance = instance;
	}

	public JLabel getLblPoints() {
		return lblPoints;
	}

	public void setLblPoints(JLabel lblPoints) {
		this.lblPoints = lblPoints;
	}

	public JLabel getLblLife() {
		return lblLife;
	}

	public void setLblLife(JLabel lblLife) {
		this.lblLife = lblLife;
	}

	public JLabel getLblTime() {
		return lblTime;
	}

	public void setLblTime(JLabel lblTime) {
		this.lblTime = lblTime;
	}

	public JLabel getLblAlien() {
		return lblAlien;
	}

	public void setLblAlien(JLabel lblAlien) {
		this.lblAlien = lblAlien;
	}

	public JLabel getLblMeteor() {
		return lblMeteor;
	}

	public void setLblMeteor(JLabel lblMeteor) {
		this.lblMeteor = lblMeteor;
	}

	public JLabel getLblPlanet() {
		return lblPlanet;
	}

	public void setLblPlanet(JLabel lblPlanet) {
		this.lblPlanet = lblPlanet;
	}

	public JLabel getPlanet() {
		return planet;
	}

	public void setPlanet(JLabel planet) {
		this.planet = planet;
	}

	public JLabel getMeteor() {
		return meteor;
	}

	public void setMeteor(JLabel meteor) {
		this.meteor = meteor;
	}

	public JLabel getAlien() {
		return alien;
	}

	public void setAlien(JLabel alien) {
		this.alien = alien;
	}

	public JLabel getTime() {
		return time;
	}

	public void setTime(JLabel time) {
		this.time = time;
	}

	public JLabel getLife() {
		return life;
	}

	public void setLife(JLabel life) {
		this.life = life;
	}

	public JLabel getPoints() {
		return points;
	}

	public void setPoints(JLabel points) {
		this.points = points;
	}
	
	

}
