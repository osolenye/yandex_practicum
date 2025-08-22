package sprint5.exceptions;

public class JavaExceptions {
    public static void main(String[] args) {
        // Throwable parent class of all Exception classes
        // Exception and it's children are most popular and in charge of runtime exceptions(while running) and other
        // error - something like out of memory error or with JVM and requires rerunning the whole program
        // checked exceptions are the ones that are important to check and work on like type checking. It is all except Runtime exception
        // unchecked are the ones that are logically shouldn't be handled: errors and Runtime exception

        // stack trace is all instructions that didn't finish due to exception in program
        // it shows the thread in which in failed, the exception itself and all methods in stack that can't finish
        calculate1();
    }

    public static java.net.URL parseUrl(final String input) {
//        return new java.net.URL(input); // unhandled exception must be handled
        return null;
    }

    static void calculate1() {
        calculate2();
    }
    static void calculate2() {
        calculate3();
    }
    static void calculate3() {
        calculate4();
    }
    static void calculate4() {
        System.out.println(10 / 0);
    }
}
