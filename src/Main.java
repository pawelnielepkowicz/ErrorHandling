public class Main {

    public static void main(String[] args) {

        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch(SimpleException e) {
            System.out.println("Caught it!");

        }

        

        FullConstructors FC = new FullConstructors();


        new LoggingExceptions();
        new ExceptionMethods();


    }
}
