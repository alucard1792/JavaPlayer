package org.controller;

import org.model.Song;
import org.view.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class OpenFileController implements ActionListener{
	
	Window window;
	Song song;
	
	public OpenFileController(Window window, Song song){
		this.song = song;
		this.window = window;
		window.getBtOpen().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.getBtOpen()) {
			JFileChooser jFileChooser = new JFileChooser();
			jFileChooser.showOpenDialog(null);
			FileNameExtensionFilter filter = new FileNameExtensionFilter(new String("mp3 files"), "mp3");
			jFileChooser.setFileFilter(filter);
			jFileChooser.setAcceptAllFileFilterUsed(false);
			File file = jFileChooser.getSelectedFile();
			file.getPath();
			window.getLbSongTitle().setText(file.getName());
			window.setFilePath(file.getPath());
		}
		
	}
	
}