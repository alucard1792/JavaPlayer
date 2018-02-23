package org.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.model.Player;
import org.model.Song;
import org.view.Window;

public class ChangeSongController implements ActionListener{
	
	private Window window;
	private Player player;
	private OpenFileController openFileController;
	private int index = 0;
	
	public ChangeSongController(Window window, Player player, OpenFileController openFileController) {
		this.window = window;
		this.player = player;
		this.openFileController = openFileController;
		window.getBtNext().addActionListener(this);
		window.getBtPrevious().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == window.getBtNext() && isPlaylistFill()) {
			openFileController.nextSong();	
			player.playFile();
			
		}else if(e.getSource() == window.getBtPrevious() && isPlaylistFill()) {
			openFileController.previuosSong();
			player.playFile();
			
		}else {
			JOptionPane.showMessageDialog(window, "Please, add songs to playlist");
			
		}
		
	}
	
	public boolean isPlaylistFill() {
		return (!openFileController.getPlaylist().isEmpty());
		
	}
	
	
}
