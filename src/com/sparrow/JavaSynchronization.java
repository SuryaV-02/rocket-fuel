package com.sparrow;

class AccessObject{
    synchronized static void printSpecies(String name, int times){
        for(int i=0;i<times;++i){
            System.out.println(name);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println("Can't sleep");
            }
        }
    }
}

class SpeciesThread extends Thread{
    AccessObject obj;
    String species;
    int times;
    SpeciesThread(AccessObject obj, String species,int times){
        this.obj = obj;
        this.species = species;
        this.times = times;
    }

    @Override
    public void run() {
        super.run();      //does nothing
        AccessObject.printSpecies(this.species,this.times);
    }
}

public class JavaSynchronization {
    public static void main(String[] args) {
        AccessObject obj = new AccessObject();
        AccessObject obj2 = new AccessObject();

        SpeciesThread thread1 = new SpeciesThread(obj,"Lion",10);
        SpeciesThread thread2 = new SpeciesThread(obj,"Elephant",10);

        SpeciesThread thread3 = new SpeciesThread(obj2, "Pigeon",10);
        SpeciesThread thread4 = new SpeciesThread(obj2, "Bat",10);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
