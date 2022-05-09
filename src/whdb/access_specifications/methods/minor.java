package whdb.access_specifications.methods;

import whdb.access_specifications.outerpackage.Animal;

public class minor extends Major{


    public void test_parent_method(){
        default_help();
    }

    public static void main(String[] args) {

        Major m = new Major();

//        m.help();
// TODO: 04-May-22  
        System.out.println(m.uname);

        m.default_help();

        m.protected_help();

        String gang_code = m.gangCode;

//        Animal a = new Animal("ti");
        minor min = new minor();
        min.test_parent_method();

    }
}
