package org.model;

import java.io.File;

import org.view.Window;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Player {

	private BasicPlayer player = new BasicPlayer();
	private Window window;
	private String path;
	
	public Player(Window window){
		this.window = window;
		
	}
	
	public void playFile(){
        path = window.getFilePath();
        path = path.replaceAll("\\\\", "/");
        System.out.println(window.getFilePath());
        System.out.println(path);
        try {
			player.open(new File(path));
			player.play();
		} catch (BasicPlayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void stopFile(){
			try {
				player.stop();
			} catch (BasicPlayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}
	
	
}
