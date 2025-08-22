package sprint5.exceptions;

public class JavaExceptions {
    public static void main(String[] args) {
        // Throwable parent class of all Exception classes
        // Exception and it's children are most popular and in charge of runtime exceptions(while running) and other
        // error - something like out of memory error or with JVM and requires rerunning the whole program
        // checked exceptions are the ones that are important to check and work on like type checking. It is all except Runtime exception

        // unchecked are the ones that are logically shouldn't be handled: errors and Runtime exception
        
    }

    public static java.net.URL parseUrl(final String input) {
//        return new java.net.URL(input); // unhandled exception must be handled
        return null;
    }
}
