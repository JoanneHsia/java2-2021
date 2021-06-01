package com.pei.car;

import javax.swing.*;

public class CarDemo1 {
    private JPanel mainPanel;
    private JPanel northPanel;
    private JTextField TextField;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo1().mainPanel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
