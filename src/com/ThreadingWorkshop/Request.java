package com.ThreadingWorkshop;

public class Request {
    int id;
    int priority;
    String message;
    Request(int id, int priority, String message){
        this.id = id;
        this.priority = priority;
        this.message = message;
    }
}
