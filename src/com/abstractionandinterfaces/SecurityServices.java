package com.abstractionandinterfaces;

class SecurityServices {
    public static void main(String[] args) {
        WindowsDefender w_def = WindowsDefender.getInstance(1998.22f,5.23f);
        WindowsDefender w_def_n = new WindowsDefender("Surya");

//                WindowsDefender w_def_err = new WindowsDefender(2.0f,5.0f);

        System.out.println(w_def.hashCode() + " " +  w_def_n.hashCode());

        w_def.defend();
        String report = w_def.getStatus_report();
        System.out.println(report);
    }
}


class WindowsDefender implements Antivirus{
    float cost;
    float version;
    private static WindowsDefender windows_defender_instance = null;
    @Override
    public void defend() {
        System.out.println("Currently Protecting your privacy");
    }

    @Override
    public String getStatus_report() {
        String default_report = "We found no threats/issues during the scan.";
        return "Status Report:-\nver." + this.version + "\n" + default_report;
    }

    private WindowsDefender(float cost, float version ){
        this.cost = cost;
        this.version = version;
    }

    WindowsDefender(String name){
        System.out.println(name);
    }
    public static WindowsDefender getInstance(float cost,float version){
        if(windows_defender_instance==null)
            windows_defender_instance = new WindowsDefender(cost,version);
        return windows_defender_instance;
    }
}