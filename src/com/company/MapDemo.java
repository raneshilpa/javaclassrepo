package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(2,"efg");
        String s = map.get(1);
        System.out.println(s);

        Set<Map.Entry<Integer,String>> entries = map.entrySet();



    }
}
