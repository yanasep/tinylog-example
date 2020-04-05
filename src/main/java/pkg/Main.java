package pkg;

import org.tinylog.Logger;

public class Main {

    public static void main(String[] args) {
        Logger.error("This is an ERROR message.");
        Logger.warn("This is an WARN message.");
        Logger.info("This is an INFO message.");
        Logger.debug("This is an DEBUG message.");
        Logger.trace("This is an TRACE message.");
//        Logger.info("User's name is " + System.getProperty("user.name")); // Using '+' is inefficient
        Logger.info("User's name is {}", System.getProperty("user.name"));
        Logger.error(new RuntimeException("Oops."), "Something is wrong.");
    }
}
