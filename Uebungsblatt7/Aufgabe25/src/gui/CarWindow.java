package gui;

import data.Car;
import data.CarContainer;
import data.CarException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarWindow extends JFrame implements ActionListener {
    private CarContainer con;
    private JComboBox<Car> carComboBox;
    private JButton editButton;

    public CarWindow(CarContainer con) {
        super("All available Cars");
        this.con = con;

        carComboBox = new JComboBox<>();
        con.forEach(carComboBox::addItem);
        carComboBox.setEditable(false);
        add(carComboBox, BorderLayout.CENTER);
        editButton = new JButton("Edit car");
        editButton.addActionListener(this);
        add(editButton, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void setCurrentCar(int seats, String plate) throws CarException {
        if (carComboBox.getSelectedItem() instanceof Car c) {
            try {
                c.setNumberOfSeats(seats);
                c.setLicensePlate(plate);
                System.out.println(plate);
                System.out.println(seats);
                carComboBox.setSelectedItem(c);
                carComboBox.updateUI();
            } catch (CarException e) {
                throw new CarException("the number of seats is invalid");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(editButton)) {
            onEdit();
        }
    }

    private void onEdit() {
        new CarEditDialog(this, (Car) carComboBox.getSelectedItem());
    }
}
