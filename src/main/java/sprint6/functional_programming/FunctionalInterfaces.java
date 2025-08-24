package sprint6.functional_programming;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // mostly we have to specify anonymous classes using other people's librareis
        // decomposition - breaking one big complex thing into a few small simple
        // functional interface - interface that contains only one abstract method
    }
}

// an annotation to tell the compiler that it's a functional interface
@FunctionalInterface
interface example {
    String transform(String string);
}