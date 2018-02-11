package org.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.model.Player;
import org.view.Window;

public class StopFileController implements ActionListener {
	Window window;
	Player player;

	public StopFileController(Window window, Player player) {
		this.window = window;
		this.player = player;
		window.getBtStop().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.getBtStop()) {
			player.stopFile();

		}

	}

}
