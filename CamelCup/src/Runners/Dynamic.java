package Runners;

import javax.swing.JFrame;

import Graphics.GraphicsPanel;

public class Dynamic {
	public static void main(String[] args) {
		GraphicsPanel g = new GraphicsPanel();
		JFrame j = new JFrame("u bad");
		j.setSize(1280, 720);
		j.add(g);
		j.setVisible(true);
	}
}
