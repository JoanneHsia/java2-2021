package com.pei.stud;

public class GraduateStudent extends Student{
    int thesis;
    public GraduateStudent(String id, String name, int english, int math, int thesis) {

        super(id, name, english, math);
        this.thesis = thesis;


    }
    public void mail(){

    }
}
