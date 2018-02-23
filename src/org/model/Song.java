package org.model;

import org.view.Window;

public class Song {

	private Window window;
	private String SongName;
	private String path;

	public Song(Window window) {
		this.window = window;

	}

	public Song() {
		// TODO Auto-generated constructor stub
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return String.format("SongName=%s, path=%s", SongName, path);
	}
	
	

}
