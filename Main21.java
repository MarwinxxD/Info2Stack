package Üngsblatt5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main21 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My first Java Frame");

		frame.setSize(400, 100);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JButton RButton = new JButton("Rigth");
		
		JButton LButton = new JButton("Left");
		
		JPanel sPanel = new JPanel (new FlowLayout(FlowLayout.CENTER));
		
		JLabel SLabel = new JLabel("South");
		
		JTextField tField = new JTextField ("Text...");
		
		sPanel.add(SLabel);

		mainPanel.add(RButton, BorderLayout.EAST);
		
		mainPanel.add(LButton, BorderLayout.WEST);
		
		mainPanel.add(sPanel, BorderLayout.SOUTH);
		
		mainPanel.add(tField, BorderLayout.CENTER);
		
		frame.add(mainPanel);

		frame.setVisible(true);
		
		
	}

}
