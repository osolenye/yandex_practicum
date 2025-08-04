package sprint3;

public class StaticModificator {
    public void example() {
        System.out.println(Bird.count);
        Bird bird = new Bird();
        System.out.println(bird.wings);
        System.out.println(bird.count);

        Bird parrot = new Parrot();
        parrot.sayHello();
    }

}

class Bird {
    static int wings = 2;
    static int count = 0;

    public Bird() {
        count++;
    }

    static void sayHello() {
        System.out.println("hello bird");
    }
}

class Parrot extends Bird {
//    @Override
    static void sayHello() {
        System.out.println("hello parrot");
    }
}