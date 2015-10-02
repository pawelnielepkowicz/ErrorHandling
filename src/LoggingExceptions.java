/**
 * Created by Ja on 21/09/2015.
 */

import java.util.logging.*;
import java.io.*;


class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}


public class LoggingExceptions {

    LoggingExceptions() {

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();

        } catch (LoggingException e) {
            System.err.println("Caught " + e);
        }

        finally {
            System.out.println("=======================================");
            System.out.println();
        }

    }
}





