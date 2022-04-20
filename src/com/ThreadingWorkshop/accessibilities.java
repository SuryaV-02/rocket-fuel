package com.ThreadingWorkshop;

import java.lang.Math;
public class accessibilities {
    public static Request getUSerRequest(){
        int id = (int) (Math.random() * (1000 - 500 +1) + 500);
        int priority = (int) (Math.random() * (100 - 1 +1 ) + 1);
        String message = "message";
        Request req = new Request(id,priority,message);
        return req;
    }
}
