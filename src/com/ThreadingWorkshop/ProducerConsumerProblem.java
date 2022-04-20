package com.ThreadingWorkshop;

import java.util.LinkedList;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {

        ServiceAgent serviceAgent = new ServiceAgent(8);
        Thread t_client = new Thread(() -> {
            try {
                serviceAgent.demand();
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
    LinkedList<Request> buffer = new LinkedList<Request>();
    int b_size;
//    Request currentReq;

    ServiceAgent(int memory_size){
        this.b_size = memory_size;
    }

    public ServiceAgent() {
        this.b_size = 5;
    }

    public void demand() throws InterruptedException{
        while(true){
            synchronized(this){
                Request currReq = accessibilities.getUSerRequest();
                while(buffer.size()==b_size){
                    buffer = accessibilities.getSortedList(buffer);
                    System.out.println("P_WAIT");
                    wait();
                }
                System.out.println("Requesting : " + currReq.id + " " + currReq.priority + " " + currReq.message);
                buffer.add(currReq);
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
                Request currReq = buffer.removeFirst();
                System.out.println("Satisfying : " + currReq.id + " " + currReq.priority);
                notify();
                Thread.sleep(1000);
            }
        }
    }

}
