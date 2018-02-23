package org.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.model.Song;

public class Window extends JFrame {
	
	private JLabel lbSongTitle = new JLabel("Not selected file");
	private JButton btPlay = new JButton("Play song");
	private JButton btStop = new JButton("Stop song");
	private JButton btOpen = new JButton("Open file");
	private JButton btNext = new JButton("Next song");
	private JButton btPrevious = new JButton("Previous song");
	private JButton btPrint = new JButton("View playlist");
	
	private String filePath;
	
	public Window(){
		setTitle("Java player");
		contructFrame();
		addElements(btPlay, btStop, btOpen, btNext, btPrevious, btPrint);
		addElements(lbSongTitle);
		
	}
	
	public void contructFrame(){
		lbSongTitle.setBounds(10, 25, 620, 14);
		btPlay.setBounds(50, 100, 89, 23);
		btStop.setBounds(150, 100, 91, 23);
		btOpen.setBounds(250, 100, 89, 23);
		btPrevious.setBounds(350, 100, 115, 23);
		btNext.setBounds(475, 100, 100, 23);
		btPrint.setBounds(242, 130, 105, 23);
		setSize(640, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		
	}
	
	public void addElements(JButton... elements){
		for (JButton jButton:elements) {
			add(jButton);
		}
		
	}
	
	public void addElements(JLabel... elements){
		for (JLabel jLabel:elements) {
			add(jLabel);
		}
		
	}
	
	public void setLabels(Song song) {
		this.lbSongTitle.setText(song.getSongName());
		this.filePath = song.getPath();
		
	}

	public JLabel getLbSongTitle() {
		return lbSongTitle;
	}

	public void setLbSongTitle(JLabel lbSongTitle) {
		this.lbSongTitle = lbSongTitle;
	}

	public JButton getBtPlay() {
		return btPlay;
	}

	public void setBtPlay(JButton btPlay) {
		this.btPlay = btPlay;
	}

	public JButton getBtStop() {
		return btStop;
	}

	public void setBtStop(JButton btStop) {
		this.btStop = btStop;
	}

	public JButton getBtOpen() {
		return btOpen;
	}

	public void setBtOpen(JButton btOpen) {
		this.btOpen = btOpen;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public JButton getBtNext() {
		return btNext;
	}

	public void setBtNext(JButton btNext) {
		this.btNext = btNext;
	}

	public JButton getBtPrevious() {
		return btPrevious;
	}

	public void setBtPrevious(JButton btPrevious) {
		this.btPrevious = btPrevious;
	}

	public JButton getBtPrint() {
		return btPrint;
	}

	public void setBtPrint(JButton btPrint) {
		this.btPrint = btPrint;
	}
	
}