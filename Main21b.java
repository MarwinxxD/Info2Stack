package Üngsblatt5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main21b {

	public static void main(String[] args) {

		int frameSize = 16 * 20;

		JFrame frame = new JFrame("Grey Color Scheme");

		frame.setSize(frameSize, frameSize);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel gridPanel = new JPanel();

		gridPanel.setLayout(new GridLayout(16, 16));

		for (int i = 0; i <= 255; i++) {
			
			JButton GButton = new JButton();

			int c = (int) ((i / 255.0) * 255);
			Color COul = new Color(c, c, c);
			GButton.setBackground(COul);
			GButton.setPreferredSize(new Dimension(20, 20));
			gridPanel.add(GButton);
		}

		frame.add(gridPanel);
		frame.setVisible(true);
	}
}
