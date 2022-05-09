package whdb.others;


public class Driver extends FreeType{
//

//    ? Parent has no exception case 1

//    int i_declare_no_exception(){
//
//    }

    int i_declare_no_exception() throws ArithmeticException{
        return 0;
    }

//    --------------------------------------------------------------------------------------------------------------


//
//    void i_will_throw_the_most_generic_exception() throws Exception{
//
//    }

    void i_will_throw_the_most_generic_exception() throws ArithmeticException{

    }

//    ------------------------------------------------------------------

//    void i_will_throw_the_most_specific_exception() throws Exception{
//
//    }




    public int return_sames(int a) throws ArithmeticException{
        return 500;
    }

    public static void main(String[] args) {
//        return_same(5);
        Driver d = new Driver();
        FreeType ft = new FreeType();
//
//        System.out.println(d.return_sames(1));
        try{
//            System.out.println(d.return_sames(1));
            System.out.println(ft.return_sames(1));
        }catch(ArithmeticException e){
            System.out.println("caught");
        }

//
        d.i_declare_no_exception();


        ft.say();
        ft.say("Surya");


    }

}
