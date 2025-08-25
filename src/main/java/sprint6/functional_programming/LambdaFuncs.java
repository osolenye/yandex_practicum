package sprint6.functional_programming;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaFuncs {
    public static void main(String[] args) {
        // lets us implement functinal interfaces very fast


        //example anonymous class
        Consumer<String> greeter = new Consumer<>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello, " + name + "!");
            }
        };
        greeter.accept("Bekzat");

        // same thing but via lambda funcs
        Consumer<String> greeter2 = (String name) -> {
            System.out.println("Hello, " + name + "!");
        };
        greeter2.accept("Bekzat");

        // even more minimalistic way to write it
        Consumer<String> greeter3 = name -> System.out.println("Hello, " + name + "!");
        greeter3.accept("Bekzat");
    }
    // example of a lambda function
    Predicate<String> x = (String text) -> {
        return Character.isUpperCase(text.charAt(0));
    };
}

//@FunctionalInterface
//interface Consumer<T> {
//    void accept(T name);
//}