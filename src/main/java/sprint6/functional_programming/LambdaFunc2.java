package sprint6.functional_programming;

import java.util.function.UnaryOperator;

public class LambdaFunc2 {
    public static void main(String[] args) {

    }
}

class Person {
    private String name;
    private String favouriteSpice;

    public Person(String name, String favouriteSpice) {
        this.name = name;
        this.favouriteSpice = favouriteSpice;
    }

    public UnaryOperator<String> addFavouriteSpice() {
        return null;
    }
}