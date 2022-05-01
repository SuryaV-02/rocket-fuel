package com.abstractionandinterfaces;

abstract class Sensor {
    String sensor_location;
    abstract void check_working();
    void help(){
        System.out.println("A sensor is a physical device that helps you to measure physical readings and gives you the data.");
    }
}


