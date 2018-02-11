package org.model;

import org.view.Window;

public class Song {

	private Window window;
	private String SongName;

	public Song(Window window) {
		this.window = window;

	}

	public String getSongName() {
		return SongName;
	}

	public void setSongName(String songName) {
		SongName = songName;
	}

	public void changeLabel() {
		window.getLbSongTitle().setText(SongName);
		
	}

}
