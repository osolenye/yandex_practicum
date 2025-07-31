package sprint1.type_importance;

public class LinkAndPrimitive {
    public void example() {
        int number = 5;
        changeValue(number);
        System.out.println(number);

        Cat cat = new Cat();
        cat.color = "mivi";
        System.out.println(cat.color);
        changeColor(cat);
        System.out.println(cat.color);
    }

    public void changeValue(int number) {
        number = number + 1;
        System.out.println(number);
    }
    public void changeColor(Cat cat) {
        cat.color = "nada";
    }
}

class Cat {
    String color;
}