package io.gk.game.gui;

import io.gk.game.general.LanguageType;
import io.gk.game.globals.AppConfig;
import io.gk.game.globals.AppStrings;

import javax.swing.*;
import java.awt.*;


/**
 * @author gentjan kolicaj
 * 
 * 					
 */
public class InfoPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5721034667703751645L;
	
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
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblLev;
	private JLabel lblLevel;

	public InfoPanel() {
		this.instance = this;

		initInfoPanelComponents();
	}

	private void initInfoPanelComponents() {

		LanguageType language = AppConfig.AppLanguage;

		setPreferredSize(new Dimension(AppConfig.INFO_PANEL_WIDTH, AppConfig.INFO_PANEL_HEIGHT));
		setBackground(new Color(250, 250, 250));

		setLayout(null);

		lblPoints = new JLabel(AppStrings.points.get(language).getContent());
		lblPoints.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPoints.setBounds(10, 11, 148, 18);
		add(lblPoints);

		lblLife = new JLabel(AppStrings.life.get(language).getContent());
		lblLife.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLife.setBounds(10, 40, 148, 18);
		add(lblLife);

		lblTime = new JLabel(AppStrings.time.get(language).getContent());
		lblTime.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTime.setBounds(10, 70, 148, 18);
		add(lblTime);

		points = new JLabel("");
		points.setBounds(168, 11, 68, 18);
		add(points);

		life = new JLabel("");
		life.setBounds(168, 40, 68, 18);
		add(life);

		time = new JLabel("");
		time.setBounds(168, 70, 68, 18);
		add(time);

		lblAlien = new JLabel(AppStrings.alien.get(language).getContent());
		lblAlien.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAlien.setBounds(286, 11, 125, 18);
		add(lblAlien);

		lblMeteor = new JLabel(AppStrings.meteor.get(language).getContent());
		lblMeteor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMeteor.setBounds(286, 40, 125, 18);
		add(lblMeteor);

		lblPlanet = new JLabel(AppStrings.planet.get(language).getContent());
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
		
		JLabel lblCoordX = new JLabel("X :");
		lblCoordX.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCoordX.setBounds(499, 11, 125, 18);
		add(lblCoordX);
		
		lblX = new JLabel("");
		lblX.setBounds(634, 11, 68, 18);
		add(lblX);
		
		JLabel lblCoordY = new JLabel("Y :");
		lblCoordY.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCoordY.setBounds(499, 40, 125, 18);
		add(lblCoordY);
		
		lblY = new JLabel("");
		lblY.setBounds(634, 40, 68, 18);
		add(lblY);
		
		lblLev = new JLabel(AppStrings.level.get(language).getContent());
		lblLev.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLev.setBounds(499, 70, 125, 18);
		add(lblLev);
		
		lblLevel = new JLabel("");
		lblLevel.setBounds(634, 70, 68, 18);
		add(lblLevel);

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

	public JLabel getLblX() {
		return lblX;
	}

	public void setLblX(JLabel lblX) {
		this.lblX = lblX;
	}

	public JLabel getLblY() {
		return lblY;
	}

	public void setLblY(JLabel lblY) {
		this.lblY = lblY;
	}

	public JLabel getLblLev() {
		return lblLev;
	}

	public void setLblLev(JLabel lblLev) {
		this.lblLev = lblLev;
	}

	public JLabel getLblLevel() {
		return lblLevel;
	}

	public void setLblLevel(JLabel lblLevel) {
		this.lblLevel = lblLevel;
	}


}
