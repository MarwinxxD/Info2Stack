package zweiundzwanzig;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CListen implements ActionListener {
    JFrame frame;
    JComboBox<String> comboBox;

    public CListen(JFrame _frame, JComboBox<String> _comboBox) {
        frame = _frame;
        comboBox = _comboBox;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedTitle = (String) comboBox.getSelectedItem();
        frame.setTitle(selectedTitle);
    }
}
