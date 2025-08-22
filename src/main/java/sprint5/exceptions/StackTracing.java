package sprint5.exceptions;

public class StackTracing {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (ArithmeticException e) {
            // printStackTrace() returns the stack trace like there is no catch
            e.printStackTrace();
        }
    }

    static int calculate() {
        return 10 / 0;
    }
}
