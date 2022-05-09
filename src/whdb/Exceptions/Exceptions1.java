package whdb.Exceptions;

public class Exceptions1 {
    public static void main(String[] args) {

        String name = null;
        try{
//            System.out.println(name.length());
//            int a  =5/0;
            throw new RuntimeException();
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic exception!");
        } catch (NullPointerException e){
            System.out.println("accessing Null!!");
        } catch(Exception npe){
            System.out.println("Hmm.. some exception");
            npe.printStackTrace();
        }finally {
            System.out.println("I cannot be ignored.");
        }
    }
}
