package com.pei.collection;

import com.pei.test.Box;
import com.pei.test.Box1;
import com.pei.test.Box2;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 3;
//      nums[1] = "Hank";
//      nums[2] = true;

        ArrayList list = new ArrayList();
        list.add("Hank");
        list.add(123);
        list.add(true);
        Box1 box = new Box1();
        list.add(box);

        /*
        Integer n = new Integer(789);
        list.add(n);
        Float f = new Float(0.5);
        Double d = new Double(0.03);
        Short s = new Short("3");
        Long l = new Long("8");
        Byte b = new Byte("2");
        Character c = new Character('H');
         */

        //Heterogeneous NG!?
        String name = (String) list.get(0);
        String kk = (String) list.get(1); //錯誤的

        /*自己練的
        int kk = (Integer) list.get(1);
        boolean bb = (boolean) list.get(2);
        */

        //

        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);
        Box b = boxes.get(0);

    }
}
