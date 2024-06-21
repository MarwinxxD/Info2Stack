package gui;

import data.Car;
import data.CarException;

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
        JTextField plate = new JTextField(car.getLicensePlate());
        panel.add(plate, 0, 1);

        panel.add(new JLabel("numberOfSeats"), 0, 1);
        JTextField seats = new JTextField(car.getNumberOfSeats() + "");
        panel.add(seats, 1, 1);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 1));

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> {
            try {
                setCar(plate, seats);
                dispose();
            } catch (CarException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> cancel());

        buttonPanel.add(saveButton, BorderLayout.WEST);
        buttonPanel.add(cancelButton, BorderLayout.EAST);

        add(panel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        pack();

        setVisible(true);
    }

    public void setCar(JTextField licensePlate, JTextField numberOfSeats) throws CarException {
        window.setCurrentCar(Integer.parseInt(numberOfSeats.getText()), licensePlate.getText());
    }

    private void cancel() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Cancel");

        JPanel buttonPanel = new JPanel(new GridLayout(1, 1));

        JButton yesButton = new JButton("Yes");
        yesButton.addActionListener(e -> {
            dialog.dispose();
            dispose();
        });

        JButton noButton = new JButton("No");
        noButton.addActionListener(e -> dialog.dispose());


        buttonPanel.add(yesButton, BorderLayout.EAST);
        buttonPanel.add(noButton, BorderLayout.WEST);

        dialog.add(new Label("Are you sure you want to dispose of your edits?"), BorderLayout.CENTER);
        dialog.add(buttonPanel, BorderLayout.SOUTH);

        dialog.pack();
        dialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialog.setVisible(true);
    }
}
