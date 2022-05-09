package whdb.Exceptions;

public class canICatchThrowable {
    public static void main(String[] args) {
        Throwable t = new Throwable("Can you throw me?");
        try{
            throw t;
        }catch (Throwable thr){
            System.out.println(thr.getMessage());
        }
    }
}
