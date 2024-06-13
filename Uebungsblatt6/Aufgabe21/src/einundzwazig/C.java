package einundzwazig;

import javax.swing.*;
import java.awt.*;

public class C extends JFrame {

    public C() {
        setTitle("Java Menus");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Save"));

        fileMenu.addSeparator();

        JRadioButtonMenuItem eins = new JRadioButtonMenuItem("Option 1");
        JRadioButtonMenuItem zwei = new JRadioButtonMenuItem("Option 2");
        JRadioButtonMenuItem drei = new JRadioButtonMenuItem("Option 3");
        JRadioButtonMenuItem vier = new JRadioButtonMenuItem("Option 4");
        ButtonGroup group = new ButtonGroup();
        group.add(eins);
        group.add(zwei);
        group.add(drei);
        group.add(vier);

        fileMenu.add(eins);
        fileMenu.add(zwei);
        fileMenu.add(drei);
        fileMenu.add(vier);

        JMenu editMenu = new JMenu("Edit");

        JMenuItem undoItem = new JMenuItem("Undo");
        editMenu.add(undoItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        JTextArea table = new JTextArea(4, 100);
        JScrollPane scrollThing = new JScrollPane(table);

        setJMenuBar(menuBar);
        add(scrollThing);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new C();
    }
}
