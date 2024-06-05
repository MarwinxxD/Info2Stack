package bpfuenf;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class LottoGUI extends JFrame {
    private static final int MAX_CHOICES = 6;

    private LotteryButton[] lotteryButtons = new LotteryButton[49];
    public JTextField statusField;
    private int currentChosen;
    List<Integer> inputs = new ArrayList<>();

    public LottoGUI() {
        setTitle("Lotto 6 aus 49");

        /*JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 7));*/

        for (int i = 0; i < 49; i++) {
            LotteryButton a = new LotteryButton(i + 1);
            a.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    pick(a.getNumber());
                }
            });
            lotteryButtons[i] = a;
            add(a);
            //panel.add(a);
        }

        JButton playButton = new JButton("PLAY!");
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playLottery(getInputs());
            }
        });
        playButton.setBounds(0, 0, 600, 30);
        add(playButton);

        statusField = new JTextField();
        statusField.setEditable(false);
        statusField.setBounds(0, 220, 600, 40);

        /*add(playButton, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(statusField, BorderLayout.SOUTH);*/

        setSize(600, 300);
        setVisible(true);
    }

    public int[] getInputs() {
        return inputs.stream().mapToInt(i -> i).toArray();
    }

    public void setInputs(int x) {
        if(!inputs.contains(x)) {
            inputs.add(x);
        } else {
            inputs.remove((Integer) x);

        }
    }

    public void pick(int i) {
        i--;

        if(lotteryButtons[i].getChosen()) {
            lotteryButtons[i].setChosen(false);
            lotteryButtons[i].setText(String.valueOf(lotteryButtons[i].getNumber()));
            lotteryButtons[i].setForeground(Color.BLACK);
            setInputs(lotteryButtons[i].getNumber());
            statusField.setText("removed "+ lotteryButtons[i].getNumber());
            currentChosen--;
        } else {
            if (currentChosen >= MAX_CHOICES) {
                statusField.setText("Maximal 6 Zahlen auswählen!");
            } else {
                lotteryButtons[i].setChosen(true);
                lotteryButtons[i].setText("X");
                lotteryButtons[i].setForeground(Color.BLUE);
                setInputs(lotteryButtons[i].getNumber());
                statusField.setText("added "+ lotteryButtons[i].getNumber());
                currentChosen++;
            }
        }
    }

    public void playLottery(int[] inputs) {
        if (inputs.length != MAX_CHOICES) {
            statusField.setText("Invalid number of choices");
        }

        int correct = 0;

        int rand;

        int[] lottonumbers = new int[MAX_CHOICES];

        for (int i = 0; i < MAX_CHOICES; i++) {
            rand = new Random().nextInt(1,50);
            if (Arrays.asList(lottonumbers).contains(rand)) {
                i--;
            } else {
                lottonumbers[i] = rand;
            }
        }

        for (int i = 0; i < MAX_CHOICES; i++) {
            for(int j = 0; j < MAX_CHOICES; j++) {
                if(lottonumbers[i] == inputs[j]) {
                    correct++;
                }
            }
        }

        statusField.setText("Correct: " + correct + " out of " + MAX_CHOICES);
    }
}
