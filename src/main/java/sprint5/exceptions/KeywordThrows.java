package sprint5.exceptions;

public class KeywordThrows {
    public static void main(String[] args) {
        methodWithException(true);
    }

    // throws keywoard meaning that it can throw an exception. it tells it to the compiler
    static void methodWithException(boolean doesItThrow) throws RuntimeException {
        if (doesItThrow) {
            throw new RuntimeException();
        }
    }
}
