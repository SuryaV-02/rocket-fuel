package com.workshop;

class parent{
    String rights;
    parent(){
        this.rights = "The right of the parent";
    }
}

public class Test extends parent{
    String child_rights = "THe rights of the children";
    public static void main(String[] args) {
        parent par = new Test();
        Test child = new Test();
        System.out.println(child.child_rights);
        System.out.println(par.rights);
    }
}
