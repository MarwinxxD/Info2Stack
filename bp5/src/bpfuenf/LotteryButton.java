package bpfuenf;

import javax.swing.*;

public class LotteryButton extends JButton {
    private static final int DISTANCE_BETWEEN_BUTTONS_X = 80;
    private static final int DISTANCE_BETWEEN_BUTTONS_Y = 25;
    private static final int DISTANCE_FROM_LEFT = 15;
    private static final int DISTANCE_FROM_TOP = 40;
    private final int number;

    private boolean chosen = false;

    public LotteryButton(int number) {
        this.number = number;

        int posX = ((number - 1) % 7) * DISTANCE_BETWEEN_BUTTONS_X;
        int posY = (((number - 1) / 7)) * DISTANCE_BETWEEN_BUTTONS_Y;

        setBounds(posX + DISTANCE_FROM_LEFT, posY + DISTANCE_FROM_TOP, 75, 20);

        setText(String.valueOf(number));
    }

    public int getNumber() {
        return number;
    }

    public boolean getChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }
}
