/**
 * Created by Ja on 21/09/2015.
 */
public class ExceptionMethods {
    ExceptionMethods(){
        try{
            throw new Exception("The simplest, the most general exception ever!");
        }
        catch (Exception e){


            System.out.println("Caught Exception");
            System.out.println("getMessage():" + e.getMessage());
            System.out.println("getLocalizedMessage():" +
                    e.getLocalizedMessage());
            System.out.println("toString():" + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);


        }
        finally {
            System.out.println("=======================================");
            System.out.println();
        }

    }
}
