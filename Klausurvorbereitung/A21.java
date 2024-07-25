package Klausurvorbereitung;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A21 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("My First Java Frame");
		
		frame.setSize(400, 100);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField text = new JTextField ("Text");
		
		JButton lButton = new JButton ("left");
		
		JButton rButton = new JButton ("right");
		
		JLabel sLabel = new JLabel ("South");
		
		JPanel panel = new JPanel (new BorderLayout ());
		
		panel.add( sLabel, BorderLayout.SOUTH);
		
		panel.add( rButton, BorderLayout.EAST);
		
		panel.add( lButton, BorderLayout.WEST);
		
		panel.add( text, BorderLayout.NORTH);
		
		frame.add(panel);
		
		frame.setVisible(true);

	}

}
