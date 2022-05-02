package com.collections;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(223,"Surya Venkatesan");
        map.put(222,"Suraj N");
        map.put(213,"Sri Viveknath SR");
        map.put(242,"Vijay A");

        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> e = itr.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
