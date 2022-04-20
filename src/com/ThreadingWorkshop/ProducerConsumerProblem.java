package com.ThreadingWorkshop;

import java.util.LinkedList;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {

        ServiceAgent serviceAgent = new ServiceAgent();
        Thread t_client = new Thread(() -> {
            try {
                serviceAgent.request();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t_service = new Thread(() -> {
            try{
                serviceAgent.satisfy();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        t_client.start();
        t_service.start();

        t_client.join();
        t_service.join();

}
}


class ServiceAgent{
    LinkedList<Integer> buffer = new LinkedList<>();
    int b_size;

    ServiceAgent(int memory_size){
        this.b_size = memory_size;
    }

    public ServiceAgent() {
        this.b_size = 5;
    }

    public void request() throws InterruptedException{
        int value = 1;
        while(true){
            synchronized(this){
                while(buffer.size()==b_size){
                    System.out.println("P_WAIT");
                    wait();
                }
                System.out.println("Produced : " + value);
                buffer.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void satisfy() throws InterruptedException{
        while(true){
            synchronized(this){
                while(buffer.size() == 0){
                    System.out.println("C_WAIT");
                    wait();
                }
                System.out.println("Consumed : " + buffer.removeFirst());
                notify();
                Thread.sleep(1000);
            }
        }
    }

}
