package bpfuenf;

import javax.swing.*;

public class LotteryButton extends JButton {
    private final int number;

    private boolean chosen = false;

    public LotteryButton(int number) {
        this.number = number;

        int posX = ((number - 1) % 7) * 80;
        int posY = (((number - 1) / 7) + 1) * 25;

        setBounds(posX + 15, posY + 10, 75, 20);

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
