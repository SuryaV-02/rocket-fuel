package com.misc.enums;

enum Process {HOLD(0,23.4f), RUN(1,0f), WAIT(2,10.2f);
    int p_status_code;
    float preemption_time;
    Process(int code, Float preemption_time){
        this.p_status_code = code;
        this.preemption_time = preemption_time;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("Process : Code : Preemption-time");
        for(Process p : Process.values()){
            System.out.println(p + " " + p.p_status_code + " " + p.preemption_time);
        }
    }

}
