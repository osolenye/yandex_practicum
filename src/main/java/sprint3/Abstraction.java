package sprint3;

public class Abstraction {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.move();
        Toad toad = new Toad();
        toad.move();

        System.out.println(frog.getColor());
        System.out.println(toad.getColor());
    }
}

abstract class Amphibian {
    protected String color;

    public void eat() {
        System.out.println("eating some bugs");
    }

    public abstract void move();

    protected Amphibian(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

class Frog extends Amphibian {
    @Override
    public void move() {
        System.out.println("frog jumps");   
    }

    protected Frog() {
        super("green");
    }
}
class Toad extends Amphibian {
    @Override
    public void move() {
        System.out.println("toad crawls");
    }

    protected Toad() {
        super("green too loo");
    }

}