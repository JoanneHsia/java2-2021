package com.pei.test;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes = {new Box1(), new Box2(), new Box3(), new Box4(), new Box5()};
        int length = 5;
        int width = 5;
        int height = 5;
        for (Box box: boxes) {
            if (box.validate(length, width, height)) {
                System.out.println(box.name + " it is!," + box.price);
                break;
            }
        }



        /*
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        Box[] boxes = {new Box1(), new Box2()};
        System.out.println(box1.validate(10, 10, 10));
        System.out.println(box2.validate(10, 10, 10));
        int length = 15;
        int width = 5;
        int height = 5;
        if (box1.validate(length, width, height)) {
            System.out.println("BOX1 it is!");
        }
        */



    }
}
