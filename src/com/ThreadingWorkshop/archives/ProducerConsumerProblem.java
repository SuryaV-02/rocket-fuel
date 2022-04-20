package com.ThreadingWorkshop.archives;

import java.util.LinkedList;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {

        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Thread p_thread = new Thread(producer);
        Thread c_thread = new Thread(consumer);

        p_thread.start();
        c_thread.start();

        p_thread.join();
        c_thread.join();



    }
}


class Buffer{
    LinkedList<Integer> buffer = new LinkedList<>();
    int b_size=2;
}

class Producer extends Buffer implements Runnable {
    public void run(){
        int value = 0;
        while(true){
            synchronized(this){
                while(buffer.size() == b_size) {
                    try {
                        System.out.println("P_wait");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Producer produced : " + value);
                buffer.add(value++);
                System.out.println(buffer);
                notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Consumer extends Buffer implements  Runnable{
    public void run(){
        while(true){
            synchronized(this){
                System.out.println("C_BS" + buffer.size());
                while(buffer.size()==0){
                    try{
                        System.out.println("C_wait");
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer consumed : " + buffer.removeFirst());
                notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}