package com.ThreadingWorkshop;

import java.lang.Math;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class accessibilities {
    public static Request getUSerRequest(){
        int id = (int) (Math.random() * (1000 - 500 +1) + 500);
        int priority = (int) (Math.random() * (100 - 1 +1 ) + 1);
        String message = "message";
        return new Request(id,priority,message);
    }

    public static LinkedList<Request> getSortedList(LinkedList<Request> requests){
        Collections.sort(requests, new Comparator<Request>(){
            @Override
            public int compare(Request o1, Request o2) {
                return o1.priority - o2.priority;
            }
        });
        return requests;
    }
}
