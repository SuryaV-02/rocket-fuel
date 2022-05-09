package whdb.Exceptions;

import com.ecosystem.Animal;

import java.util.Scanner;


class NotGoodRequestException extends Exception {
    String msg;
    @Override
    public String getMessage() {
        return super.getMessage() + "Lion at forest";
    }
    public String getLocalizedMessage() {
        return super.getMessage() + "Lion at forest";
    }

//    public String toString() {
//        return "Lion lives in forest";
//    }
}

public class CustomExceptions {

    public static void checkIsRequestValid(String request) throws NotGoodRequestException {
        if(request.length()<5){
            Animal lion = new Animal("lion","Tig","ss",55,",","");
            throw new NotGoodRequestException();
        }else {
            System.out.println("Valid request");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your request : ");
        String req = sc.nextLine();
        try{
            checkIsRequestValid(req);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
