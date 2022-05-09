package whdb.Exceptions;

public class Exceptions2 {
    public static void main(String[] args) {
        try{
            try_me_if_you_can();
        }catch (Exception ae){
            System.out.println("Got at caller");
            ae.printStackTrace();
        }
    }

    private static void try_me_if_you_can() {
//        try{
            System.out.println(1/0);
//        }catch (ArithmeticException e){
//            System.out.println("Got at calee");
//        }
    }

}
