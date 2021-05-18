package com.pei.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box[] boxes = {new Box1(),new Box2(),new Box3(), new Box4()};

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter object's length: ");
        int length = scan.nextInt();
        System.out.println("Please enter object's width: ");
        int width = scan.nextInt();
        System.out.println("Please enter object's height: ");
        int height = scan.nextInt();
        System.out.println("length:" + length + " width:" + width + " height:" + height);

        if (box3.validate(length, width, height)) {
            System.out.println(box3.getName());
        }

        /*if (length <= 10 && width <= 10 && height <= 10) {
            System.out.println("Box 3 it is, price: 60");
        } else if (length <10 && width <= 20 && height <= 20) {
            System.out.println("Box 5 it is, price: 90");
        }*/

    }


}
