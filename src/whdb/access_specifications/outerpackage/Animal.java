package whdb.access_specifications.outerpackage;

public class Animal {
    static String name;
    protected Animal(String name){
        this.name = name;
    }
    private static class Wild{
        void print_wild(){
            System.out.println("I am a wild animal " + name);
        }
    }

    static void help(){
        System.out.println("Helping animal");
    }

    void print_details(){
        System.out.println("Theres are detalis");
        help();
    }

    public static void main(String[] args) {
        System.out.println("hello");
        Animal lion = new Animal("lion");
//        Animal.Wild chetah = new Animal.Wild();
        help();
        lion.print_details();





    }


}
