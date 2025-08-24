package sprint6.functional_programming;

public class FunctionalProgramming {
    public static void main(String[] args) {
        // treating actions like an object = functional programming
        // when we have different behaviours in our class it can require too much code
        // that's why we create an interface with different methods and pass instance as an argument
        // anonymous class - a class that is created and not used anywhere else in the project
        Test test = new Test(new Dog());
        test.example();

        // instead of creating a new class that implements our interface and bloating the code base, to this:
        Test newTest = new Test(new Animal() {
            @Override
            public void voice() {
                System.out.println("i am an anonymous class");
            }
        });
        newTest.example();
    }
}

interface Animal {
    void voice();
}


// different implementations so that we don't change the way it works in the class and just pass it as an argument
class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("meow");
    }
}

class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("bark");
    }
}

class Test {
    // field to get the correct instance of an interface to get certain method implementation
    private Animal config;

    public Test(Animal config) {
        this.config = config;
    }

    void example() {
        config.voice();
    }
}