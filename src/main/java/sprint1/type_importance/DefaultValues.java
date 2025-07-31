package sprint1.type_importance;

public class DefaultValues {
    public void example() {
        int justVariable = 1;

        Hamster hamster = new Hamster();
        System.out.println(hamster.name);
        System.out.println(hamster.isFluffy);
        System.out.println(hamster.age);
        System.out.println(hamster.weight);
        System.out.println(hamster.color);
    }
}

class Hamster {
    String name;
    int age;
    double weight;
    boolean isFluffy;
    String color;
}