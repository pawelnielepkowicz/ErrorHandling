/**
 * Created by Ja on 21/09/2015.
 */
// create custom, subclass of Exception - type object
class SimpleException extends Exception {}

public class InheritingExceptions {
    public void f() throws SimpleException {  // informs that this method thtows my brand-new checked exception
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

}
