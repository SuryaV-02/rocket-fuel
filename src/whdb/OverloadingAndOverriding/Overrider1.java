package whdb.OverloadingAndOverriding;

import java.io.IOException;

public class Overrider1 {



    void print(String m) throws Exception {
        System.out.println("string array index of out bounds " + m);
    }


    void draw(){
        System.out.println("Hello 1");
    }
//
//
//    static void print_1(int m){
//        System.out.println("unstatic " + m);
//    }
//
//
//    void learn(){
//        System.out.println("Parent learning");
//    }
//
//   public int returnSame(int a){
//        return a;
//    }
//
//
//
//
//
//
////    static void print(String m) throws IndexOutOfBoundsException{
////        System.out.println("string " + m);
////    }
//
//
////    static void static_print(){
////        System.out.println("hello static");
////    }
////
//////    ??No access specification hierarchy concept in overloading
////    void print(int m)
////    {
////        System.out.println("string " + m);
////    }
//
//    public static void print(String m)
//    {
//        System.out.println("string " + m);
//    }
//
//
////
//
////    float print(float message){
////        System.out.println("int  " + message);
////        return 0.0f;
////    }
//
////
////    public static int print(float message){
////        System.out.println("float " + message);
////        return 0;
////    }
//
////?? most specific to least specific access is accepted in overriding
////    private int returnSame(int a ){
////        return a;
////    }
//
////     static int print(float message){
////        System.out.println("float " + message);
////        return 0;
////    }
//
//
//
//// ?? Static to non static over loading
////    int print(float message){
////        System.out.println("float " + message);
////        return 0;
////    }
//
//
////    ? same args dt, only changing in return type !
//
////    static void print(int m){
////        System.out.println("double " + m);
////    }
////
////     void print(int m){
////        System.out.println("unstatic " + m);
////    }
////
////    static void print(long m){
////        System.out.println("unstatic " + m);
////    }
////
////    static void print(char m){
////        System.out.println("char " + m);
////    }


    public static void main(String[] args) {
        double d = 22.55;
        byte b = 122;

        short sh = 5;

//        ? calling unstatic guy
//        print(5);
    }
}
