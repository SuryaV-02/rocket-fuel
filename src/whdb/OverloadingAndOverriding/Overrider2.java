package whdb.OverloadingAndOverriding;

import java.io.IOException;

public class Overrider2 extends Overrider1{


//    void draw(){
//        super.draw();
//        System.out.println("Hello 2");
//    }
//    ?? ovrriding static is possible but is of no use

//    static int print(float message){
//        System.out.println("float lala " + message);
//        return 0;
//    }
//
//
//    static void print_1(int m){
//        System.out.println("unstatic at 2" + m);
//    }
//
//    void learn(){
//        System.out.println("Child learning");
//    }
//
//    void print(int m)
//    {
//        System.out.println("string over here " + m);
//    }
//
//    void get_details(){
//        System.out.println("hhss");
//    }
//
//
//    protected static void print(String m)
//    {
//        System.out.println("string " + m);
//    }


    //     int print(byte message){
//        System.out.println("float la " + message);
//        return 0;
//    }
//
////    ?? static to non static overriding
////    int print(float message) {
////        System.out.println("float " + message);
////        return 0;
////    }
//
////// ?? non-static to static overriding
//    static void print_2(int m){
//        System.out.println("unstatic " + m);
//    }
//
//

    void print(String m) throws IOException {
        System.out.println("string array index of out bounds " + m);
    }

//    //?? most specific to least specific access is accepted in overriding
//    private int returnSame(int a){
//        return a;
//    }

        public static void main(String[] args) {
//
        Overrider2 o2 = new Overrider2();
        o2.draw();
//
//
////        Calling Parent's static method from child
//        Overrider1.print_1(5);
//
//
//            o2.learn();
//
            Overrider1 o1 = new Overrider2();
            o1.draw();
//
//            o1.learn();
//            o1.print_1(5);
//            o2.print_1(10);

    }
}
