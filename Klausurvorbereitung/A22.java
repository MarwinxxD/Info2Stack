package Klausurvorbereitung;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A22 {
	
	public static void main (String[]args) {
		
		JFrame frame = new JFrame ("Color Switcher");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel ();
		
		JButton rb = new JButton ("red");
		
		JButton gb = new JButton ("green");
		
		gb.addActionListener (e -> { p.setBackground(Color.GREEN); });
		
		rb.addActionListener( e -> { p.setBackground(Color.RED); });
		
		p.add(gb);
		
		p.add(rb);
		
		frame.add(p);
		
		frame.setVisible(true);
		
	}

}
