package whdb.access_specifications.methods;

class Major {

    public Major(String test){
        System.out.println("I'm accessible!");
    }

    Major(){

    }

    private String password;
    String uname;
    protected String gangCode;

    private void help(){
        System.out.println("A help query");
    }

    void default_help(){
        System.out.println("Default help");
        help();

    }

    public static void static_method(){
        System.out.println("A static guy");
    }

    protected void protected_help(){
        System.out.println("Protected help");
    }

    public void public_help(){
        System.out.println("Public help");
    }

    public static void main(String[] args) {
        new Major().help();
    }

}

