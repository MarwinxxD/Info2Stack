package vierundzwanzig;

import javax.swing.*;

public class B extends JFrame {

    public B() {
        setTitle("Rechteck");

        setSize(500, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new A());

        setVisible(true);
    }

    public static void main(String[] args) {
        new B();
    }
}
