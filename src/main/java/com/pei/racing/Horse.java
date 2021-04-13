package com.pei.racing;

public class Horse extends Thread{
    @Override //Ctrl+o
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(getName() + " " + i);
        }
    }
}
