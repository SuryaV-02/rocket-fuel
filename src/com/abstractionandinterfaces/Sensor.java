package com.abstractionandinterfaces;

abstract class Sensor{
    String sensor_location;

    Sensor(String lala){
        System.out.println("Sensoe instinated");
    }
    Sensor(){}

    static void what(){
        System.out.println("I am a static content");
    }

    abstract void check_working();
    void help(){
        System.out.println("Connect to get started");
    }

}

