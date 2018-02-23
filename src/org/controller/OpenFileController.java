package org.controller;

import org.model.Song;
import org.view.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class OpenFileController implements ActionListener{
	
	private Window window;
	private Song song;
	private ArrayList<Song> playlist = new ArrayList<>();
	private int index = 0; 
	
	public OpenFileController(Window window, Song song){
		this.song = song;
		this.window = window;
		window.getBtOpen().addActionListener(this);
		window.getBtPrint().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.getBtOpen()) {
			song = new Song();
			JFileChooser jFileChooser = new JFileChooser();
			jFileChooser.showOpenDialog(null);
			FileNameExtensionFilter filter = new FileNameExtensionFilter(new String("mp3 files"), "mp3");
			jFileChooser.setFileFilter(filter);
			jFileChooser.setAcceptAllFileFilterUsed(false);
			File file = jFileChooser.getSelectedFile();
			song.setPath(file.getPath());
			song.setSongName(file.getName());
			if(playlist.isEmpty()) {
				window.setLabels(song);
				
			}
			playlist.add(song);

			
		}else if(e.getSource() == window.getBtPrint() && !playlist.isEmpty()) {
			String message = "";
			for(Song song:playlist) {
				message += song.getSongName() + "\n";
				
			}
			JOptionPane.showMessageDialog(window, message);
			
		}else {
			JOptionPane.showMessageDialog(window, "Please, add songs to playlist");
		}
		
	}

	
	public Song setLastSong() {
		if(playlist.size() > 0) {
			return(playlist.get(playlist.size() - 1));
			
		}else {
			JOptionPane.showMessageDialog(window, "Please, add songs to playlist");
			return null;
		}
		
		
	}
	
	public void nextSong() {
		if(index < (playlist.size() - 1)) {
			System.out.println(index++);
			window.setLabels(playlist.get(index));
			System.out.println("next" + playlist.get(index).toString());
			System.out.println(index);
		}else {
			System.out.println("next error: " + index);
			
			
		}
		
	}
	
	public void previuosSong() {
		if(index >= 1) {
			System.out.println(index--);
			window.setLabels(playlist.get(index));
			System.out.println("previuos " + playlist.get(index).toString());
			
			System.out.println(index);
		}else {
			System.out.println("previuos error: " + index);
			
			
		}
		
	}

	public List<Song> getPlaylist() {
		return playlist;
	}
	
}