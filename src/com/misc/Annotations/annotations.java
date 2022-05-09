package com.misc.Annotations;

import java.lang.annotation.*;
import java.rmi.StubNotFoundException;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface alert{
    int code() default 1;
    String message();
}

class Stupify{
    @alert(code=23,message = "Just to alert you Son")
    public void usage(){
        System.out.println("To Throw someone apart.");
    }
}
public class annotations {

    public static void main(String[] args) {
       Stupify s = new Stupify();
//       try{
        alert a = null;
        try {
            a = s.getClass().getMethod("usage").getAnnotation(alert.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("Annotation data : " + a.code()+ " "+ a.message());
//       }catch (NoSuchMethodException e){
//           e.printStackTrace();
////       }

    }

}
