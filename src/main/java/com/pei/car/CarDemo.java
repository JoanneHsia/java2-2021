package com.pei.car;

import javax.swing.*;

public class CarDemo {
    private JPanel mainPanel;
    private JTextField TextField;
    private JPanel northPanel;
    private JTextArea TextArea1;
    private JTextArea TextArea2;
    private JTextArea TextArea3;
    private JTextArea TextArea4;
    private JTextArea TextArea5;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton a0Button;
    private JButton a4Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
