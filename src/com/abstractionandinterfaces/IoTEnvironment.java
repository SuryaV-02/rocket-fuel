package com.abstractionandinterfaces;

public class IoTEnvironment{
    public static void main(String[] args) {
//        Dht11 dht = new Dht11("Anterior ring A");
//        dht.help();
//        dht.setCurrent_reading(12.55f);
//        String reading= Float.toString(dht.getCurrent_reading());
//        System.out.println("Current reading of "  + dht.getSensor_location() + " is " + reading);
//


        Sensor dht11 = new Dht11("Anterior ring A");
        dht11.check_working();

        Sensor buzzer = new Buzzer("Pressure issue buzz");
        buzzer.check_working();




    }
}

class Dht11 extends Sensor{
    private float current_reading;
    @Override
    void check_working(){
        System.out.println("DHT11 is working");
    }
    void setCurrent_reading(float reading){
        this.current_reading = reading;
    }
    float getCurrent_reading(){
        return this.current_reading;
    }
    String getSensor_location(){
        return this.sensor_location;
    }
    Dht11(String name){
//        this.sensor_location = name;
    }

    @Override
    void help() {
        super.help();
        System.out.println("DHT11 is capable of measuring temperature and humidity readings for you.");
    }
}

class Buzzer extends Sensor{
    private float current_reading;
    @Override
    void check_working(){
        System.out.println("Buzzer is working");
    }
    String getSensor_location(){
        return this.sensor_location;
    }
    Buzzer(String name){
        this.sensor_location = name;
    }
    @Override
    void help() {
        super.help();
        System.out.println("Buzzer beeps for you in case of issues.");
    }
}
