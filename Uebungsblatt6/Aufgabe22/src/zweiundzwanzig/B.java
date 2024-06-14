package zweiundzwanzig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class B extends JFrame {
    private int count = 0;

    public B() {

        setTitle("Counter" + count);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(250, 80);

        JButton one = new JButton("+1");
        one.setName("one");
        one.addActionListener(this::actionPerformed);
        one.setBounds(10, 10, 50, 20);

        JButton ten = new JButton("+10");
        ten.setName("ten");
        ten.addActionListener(this::actionPerformed);
        ten.setBounds(70, 10, 60, 20);

        JButton reset = new JButton("Reset");
        reset.setName("reset");
        reset.addActionListener(this::actionPerformed);
        reset.setBounds(140, 10, 80, 20);

        add(one);
        add(ten);
        add(reset);

        setLayout(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        new B();
    }

    public void actionPerformed(ActionEvent e) {
        JButton o = (JButton)e.getSource();

        if (o.getName().equals("one")) {
            setTitle("Counter" + ++count);
        } else if (o.getName().equals("ten")) {
            count += 10;
            setTitle("Counter" + count);
        } else {
            count = 0;
            setTitle("Counter" + count);
        }
    }
}
