package com.pei.box;

public class Box2 extends Box{
    public Box2() {
        length = 7;
        width = 7;
        height = 7;
    }

    @Override
    public String getName() {
        return "Box2";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
