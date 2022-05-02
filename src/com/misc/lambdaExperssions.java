package com.misc;


interface spaceShip{
    void fly(float altitude);
}

public class lambdaExperssions {

    public static void main(String[] args) {

//         W/O lambda
        spaceShip atlantica = new spaceShip() {
            @Override
            public void fly(float altitude) {
                System.out.println("Flying at attitude " + altitude);
            }
        };

//        With lambda
        spaceShip chandayan = (altitude)->{
            System.out.println("Currentlly at altitude " + altitude);
        };

        atlantica.fly(1225.3f);
        chandayan.fly(45577.3f);
    }

}

