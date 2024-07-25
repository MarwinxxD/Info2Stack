package Klausurvorbereitung;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Counter {
	
	public static void main (String []args) {
	
	JFrame frame = new JFrame ("Counter");
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JButton one = new JButton ("+1");
	
	JButton ten = new JButton ("+10");
	
	JButton re = new JButton ("Reset");
	
	int c = 0;
	
	one.addAncestorListener(this);
	
	
	
	}
	
}
