package zweiundzwanzig;

import javax.swing.*;
import java.awt.*;

public class C extends JFrame {
    public C(String[] _options) {

        setTitle("Please select a title");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 100);

        JComboBox<String> comboBox = new JComboBox<>(_options);
        comboBox.setEditable(true);
        comboBox.addActionListener(new CListen(this, comboBox));

        add(comboBox, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new C(new String[]{"A", "B", "C"});
    }
}
