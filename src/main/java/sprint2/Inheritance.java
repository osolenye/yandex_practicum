package sprint2;

public class Inheritance {
    public void example() {
        Fox fox = new Fox();
        System.out.println(fox.toFox());
        System.out.println(fox.growl());
        System.out.println(fox.say());
        System.out.println(fox.age);
    }
}

class Animal {
    protected double weight;
    protected int age;
    protected int heartRate;
    protected boolean isWild;

    public Animal() {
        weight = 0.0;
        age = 0;
        heartRate = 100;
        isWild = false;
    }

    public String say() {
        return "I am an animal";
    }
}

class Canidae extends Animal{
    protected boolean isPredator;

    public Canidae() {
        isPredator = true;
    }

    public String growl() {
        return "Rawr";
    }
}

class Fox extends Canidae {
    protected String color;

    public Fox() {
        color = "red";
    }

    public String toFox() {
        return "hehehe";
    }
}