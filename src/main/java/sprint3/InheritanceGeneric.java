package sprint3;

import java.util.ArrayList;
import java.util.List;

public class InheritanceGeneric {
    public static void main(String[] args) {
        Bag<Fruit> bag = new Bag<Fruit>();
        bag.addFruit(new Apple());
        bag.printPurchase();
        bag.addFruit(new Banana());
        bag.printPurchase();

        Bag<Apple> appleBag = new Bag<Apple>();
        appleBag.addFruit(new Apple());
    }
}

class Bag<T extends Fruit> {
    private final List<T> purchase = new ArrayList<>();

    public void addFruit(T fruit) {
        purchase.add(fruit);
    }

    public void printPurchase() {
        for (T fruit : purchase) {
            System.out.println(fruit.getName());
        }
    }
}
class Fruit {
    private String name;
    private double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Banana extends Fruit{
    public Banana() {
        super("banana", 231.123);
    }
}

class Apple extends Fruit{
    public Apple() {
        super("apple", 1232.0);
    }
}
