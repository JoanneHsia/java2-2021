package com.pei.car;

import javax.swing.*;
import java.awt.*;

public class CarWin {

    static final int WIDTH = 600;
    static final int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button1 = new JButton("停車場");
        frame.add(button1, BorderLayout.NORTH);


        frame.setVisible(true);


    }
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("停車場", 280, 100);
    }

}
