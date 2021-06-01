package com.pei.car;

import javax.swing.*;

public class CarDemo3 {
    private JPanel mainPanel;
    private JTextField TextField;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo3().mainPanel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
