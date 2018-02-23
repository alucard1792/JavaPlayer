package org.controller;

import org.model.Player;
import org.model.Song;
import org.view.Window;

public class RunWindowController {
	
	Window window = new Window();
	Song song = new Song(window);
	Player player = new Player(window);
	OpenFileController openFileController = new OpenFileController(window, song);
	PlayFileController playFileController = new PlayFileController(window, player);
	StopFileController stopFileController = new StopFileController(window, player);
	ChangeSongController changeSongController = new ChangeSongController(window, player, openFileController);
	public void exec(){
		window.contructFrame();
		
	}

}
