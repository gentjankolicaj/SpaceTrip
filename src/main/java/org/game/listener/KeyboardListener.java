package org.game.listener;

import org.game.entities.game.SpaceShip;
import org.game.globals.AppConfig;
import org.game.globals.GameConfig;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author gentjan kolicaj
 */
public class KeyboardListener implements KeyListener {
	
	private final SpaceShip spaceShip;


    public KeyboardListener(SpaceShip spaceShip) {
		super();
		this.spaceShip = spaceShip;
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		 int key= e.getKeyCode();
			
			if(key==KeyEvent.VK_SPACE) {
				spaceShip.fire();
				
			}
			
			if(key==KeyEvent.VK_W) {
				if(spaceShip.getLocation().getY()>3) {
					spaceShip.getLocation().setY(spaceShip.getLocation().getY()-(GameConfig.spaceship_speed+1));
				}
				
			}
			
			if(key==KeyEvent.VK_S) {
				if((spaceShip.getLocation().getY()+spaceShip.getHeight()+GameConfig.spaceship_speed*2)<AppConfig.GAME_PANEL_HEIGHT) {
					spaceShip.getLocation().setY(spaceShip.getLocation().getY()+(GameConfig.spaceship_speed+1));
				}
			}
			
			
			if(key==KeyEvent.VK_A) {
				if(spaceShip.getLocation().getX()>3) {
					spaceShip.getLocation().setX(spaceShip.getLocation().getX()-(GameConfig.spaceship_speed+1));
				}
				
			}
			
			if(key==KeyEvent.VK_D) {
				if((spaceShip.getLocation().getX()+spaceShip.getWidth()+GameConfig.spaceship_speed*2)<AppConfig.GAME_PANEL_WIDTH) {
					spaceShip.getLocation().setX(spaceShip.getLocation().getX()+(GameConfig.spaceship_speed+1));
				}
			}
			
			
			if(key==KeyEvent.VK_UP) {
				if(spaceShip.getLocation().getY()>3) {
					spaceShip.getLocation().setY(spaceShip.getLocation().getY()-(GameConfig.spaceship_speed+1));
				}
				
			}
			
			if(key==KeyEvent.VK_DOWN) {
				if((spaceShip.getLocation().getY()+spaceShip.getHeight()+GameConfig.spaceship_speed*2)<AppConfig.GAME_PANEL_HEIGHT) {
					spaceShip.getLocation().setY(spaceShip.getLocation().getY()+(GameConfig.spaceship_speed+1));
				}
			}
			
			
			if(key==KeyEvent.VK_LEFT) {
				if(spaceShip.getLocation().getX()>3) {
					spaceShip.getLocation().setX(spaceShip.getLocation().getX()-(GameConfig.spaceship_speed+1));
				}
				
			}
			
			if(key==KeyEvent.VK_RIGHT) {
				if((spaceShip.getLocation().getX()+spaceShip.getWidth()+GameConfig.spaceship_speed*2)<AppConfig.GAME_PANEL_WIDTH) {
					spaceShip.getLocation().setX(spaceShip.getLocation().getX()+(GameConfig.spaceship_speed+1));
				}
			}
		
	}

	
	@Override
	public void keyReleased(KeyEvent e) {
		 int key= e.getKeyCode();
		
		if(key==KeyEvent.VK_SPACE) {
			spaceShip.fire();
			
		}
		
		if(key==KeyEvent.VK_W) {
			if(spaceShip.getLocation().getY()>3) {
				spaceShip.getLocation().setY(spaceShip.getLocation().getY()-(GameConfig.spaceship_speed+1));
			}
			
		}
		
		if(key==KeyEvent.VK_S) {
			if((spaceShip.getLocation().getY()+spaceShip.getHeight()+GameConfig.spaceship_speed*2)<AppConfig.GAME_PANEL_HEIGHT) {
				spaceShip.getLocation().setY(spaceShip.getLocation().getY()+(GameConfig.spaceship_speed+1));
			}
		}
		
		
		if(key==KeyEvent.VK_A) {
			if(spaceShip.getLocation().getX()>3) {
				spaceShip.getLocation().setX(spaceShip.getLocation().getX()-(GameConfig.spaceship_speed+1));
			}
			
		}
		
		if(key==KeyEvent.VK_D) {
			if((spaceShip.getLocation().getX()+spaceShip.getWidth()+GameConfig.spaceship_speed*2)<AppConfig.GAME_PANEL_WIDTH) {
				spaceShip.getLocation().setX(spaceShip.getLocation().getX()+(GameConfig.spaceship_speed+1));
			}
		}
		
		
		if(key==KeyEvent.VK_UP) {
			if(spaceShip.getLocation().getY()>3) {
				spaceShip.getLocation().setY(spaceShip.getLocation().getY()-(GameConfig.spaceship_speed+1));
			}
			
		}
		
		if(key==KeyEvent.VK_DOWN) {
			if((spaceShip.getLocation().getY()+spaceShip.getHeight()+GameConfig.spaceship_speed*2)<AppConfig.GAME_PANEL_HEIGHT) {
				spaceShip.getLocation().setY(spaceShip.getLocation().getY()+(GameConfig.spaceship_speed+1));
			}
		}
		
		
		if(key==KeyEvent.VK_LEFT) {
			if(spaceShip.getLocation().getX()>3) {
				spaceShip.getLocation().setX(spaceShip.getLocation().getX()-(GameConfig.spaceship_speed+1));
			}
			
		}
		
		if(key==KeyEvent.VK_RIGHT) {
			if((spaceShip.getLocation().getX()+spaceShip.getWidth()+GameConfig.spaceship_speed*2)<AppConfig.GAME_PANEL_WIDTH) {
				spaceShip.getLocation().setX(spaceShip.getLocation().getX()+(GameConfig.spaceship_speed+1));
			}
		}
		
		
	}
	
	

}
