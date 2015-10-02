/**
 * Created by Ja on 21/09/2015.
 */

class MyException extends Exception{

    public MyException(){}

    public MyException(String msg){
        super(msg);
    }
}


public class FullConstructors {

    // method throws custom exception with no message
    public static void noMessage() throws MyException{
        System.out.println("Throwing MyException from noMessage()");
        throw new MyException();

    }
    // method throws custom exception WITH message
    public static void WithMessage() throws MyException{

        System.out.println("Throwing MyException from WithMessage()");
        System.out.println("=======================================");
        System.out.println();
    }

    FullConstructors(){

        initFullConstructors();
    }

    public static void initFullConstructors(){
        try {
            noMessage();
        } catch(MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            WithMessage();
        } catch(MyException e) {
            e.printStackTrace(System.out);
        }

    }

}
