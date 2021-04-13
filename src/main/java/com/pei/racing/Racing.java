package com.pei.racing;

public class Racing {
    public static void main(String[] args) {
        /*
        String name1 = "Horse1";
        String name2 = "Horse2";
        for (int i = 0; i < 10000; i++) {
            System.out.println(name1 + i);
            System.out.println(name2 + i);
        }

         */

        Horse h1 = new Horse();
        Horse h2 = new Horse();
        HorseRunnable h3 = new HorseRunnable();
        Thread thread = new Thread(h3);
        thread.start();
        h1.start();
        h2.start();
    }
}
