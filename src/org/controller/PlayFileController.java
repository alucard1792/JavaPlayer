package org.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import org.model.Player;
import org.model.Song;
import org.view.Window;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class PlayFileController implements ActionListener{

	
	Window window;
	Player player;
	
	
	public PlayFileController(Window window, Player player){
		this.player = player;
		this.window = window;
		window.getBtPlay().addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.getBtPlay()) {
	     /*    try {
	             String path = window.getFilePath();
	             path = path.replaceAll("\\\\", "/");
	             System.out.println(window.getFilePath());
	             System.out.println(path);
	             player.open(new File(path));
	             player.play();
	             
	         } catch (BasicPlayerException ex) {
	             System.out.print("-------Error-----"+ex.getMessage());
	             
	         }
			*/
			player.playFile();
		}
		
	}

}
