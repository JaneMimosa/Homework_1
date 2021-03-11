package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyWindow extends JFrame {
    private static final ImageIcon def = new ImageIcon("src/def.png");
    private static final ImageIcon x = new ImageIcon("src/x.png");
    private static final ImageIcon o = new ImageIcon("src/о.png");
    private final JButton[][] map;

    public MyWindow() throws HeadlessException {
        setSize(360, 360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        GridLayout layout = new GridLayout(3, 3);
        JPanel panel = new JPanel(layout);
        map = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                button.setIcon(def);
                button.addActionListener(a -> {
                    if (button.getIcon().equals(def)) {
                        button.setIcon(x);
                        if (checkWin(x)) {
                            winnerDialog("Вы победили!");
                            return;
                        }
                        if (isMapFull()) {
                            dispose();
                            winnerDialog("Ничья");
                            return;
                        }
                        movePc();
                        if (checkWin(o)) {
                            winnerDialog("Компьютер победил");
                            return;
                        }
                    }

                });
                panel.add(button);
                map[i][j] = button;
            }
        }
        add(panel);
    }


    private void winnerDialog(String s) {
        new WinnerDialog(this, s);
    }
    private boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(map[i][j].getIcon().equals(def)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static Random rand = new Random();

    private void movePc() {
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!map[x][y].getIcon().equals(def));
        map[x][y].setIcon(o);
    }

    public boolean checkWin(ImageIcon symbol) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(symbol)) {
                    if (map[i][0].getIcon().equals(symbol) && map[i][1].getIcon().equals(symbol) && map[i][2].getIcon().equals(symbol)) return true;
                    if (map[0][j].getIcon().equals(symbol) && map[1][j].getIcon().equals(symbol) && map[2][j].getIcon().equals(symbol)) return true;
                    if (map[0][0].getIcon().equals(symbol) && map[1][1].getIcon().equals(symbol) && map[2][2].getIcon().equals(symbol)) return true;
                    if (map[1][1].getIcon().equals(symbol) && map[0][2].getIcon().equals(symbol) && map[2][0].getIcon().equals(symbol)) return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}

