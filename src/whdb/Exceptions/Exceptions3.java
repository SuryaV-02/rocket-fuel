package whdb.Exceptions;


import java.io.IOException;

public class Exceptions3 {

    public static void check_exception() throws IOException {
        throw new ArithmeticException();

    }

    public static void main(String[] args) {
        try {
            check_exception();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
