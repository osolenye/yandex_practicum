package sprint3;

public class Generics {
    public static void main(String[] args) {
        GeneralClass<String> generalClass = new GeneralClass<String>();
        generalClass.element = "Hello, World";
        System.out.println(generalClass.element);

        GeneralClass<Double> doubleObj =  new GeneralClass<>();
        doubleObj.element = 10.0;
        System.out.println(doubleObj.element);

    }
}

class GeneralClass<T> {
    T element;
}