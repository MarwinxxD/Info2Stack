package gui;

import data.Car;

import javax.swing.*;
import java.awt.*;

public class CarEditDialog extends JDialog {
    CarWindow window;
    Car car;

    public CarEditDialog(CarWindow _window, Car _car) {
        window = _window;

        car = _car;

        setTitle("Edit Car");

        JPanel panel = new JPanel(new GridLayout(2, 2));

        panel.add(new JLabel("licensePlate"), 0, 0);
        panel.add(new JTextField(car.getLicensePlate()), 0, 1);

        panel.add(new JLabel("numberOfSeats"), 0, 1);
        panel.add(new JTextField(car.getNumberOfSeats()), 1, 1);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 1));

        buttonPanel.add(new JButton("Save"), BorderLayout.WEST);
        buttonPanel.add(new JButton("Cancel"), BorderLayout.EAST);

        add(panel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
}
