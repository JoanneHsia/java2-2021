package com.pei.anon;

public class Tester {
    public static void main(String[] args) {
        Reporter reporter = new Reporter() {
            @Override
            public void print() {
                System.out.println("Ding dong");
            }
        };
        Reporter reporter1 = new Reporter() {
            @Override
            public void print() {
                System.out.println("Hehehe");
            }
        };
        reporter.print();
        reporter1.print();






        /*
        Reporter reporter = new Reporter();
        Printer printer = new Printer();
         */

        /*
        Reporter reporter = new WeatherReporter();
        Reporter reporter2 = new HeheheReporter();
        reporter.print();
        reporter2.print();
        */



    }
}
