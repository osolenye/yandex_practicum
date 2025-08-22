package sprint5.exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println(converter("aslkdjf"));
    }

    // can use try catch in the main method or in the method
    static int converter(final String input) {
        try {
            return Integer.parseInt(input, 10);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return 0;
        } catch (NumberFormatException n) { //can have multiple cathces to catch different exceptions
            System.out.println(n.getMessage());
            return 0;
        }
    }
}
