package com.pei.car;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("001", "王小明");
        students.put("002", "王小");
        students.put("003", "王王");
        students.put("004", "王");
        String name = students.get("001");
        System.out.println(name);

    }
}
