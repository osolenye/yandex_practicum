package sprint2;

public class SuperKeyword {
    public void example() {
        GymTeacher gymTeacher = new GymTeacher();
        gymTeacher.startLesson();
        gymTeacher.getNumberOfLessons();

        BiologyTeacher biologyTeacher = new BiologyTeacher();
        System.out.println(biologyTeacher.numberOfLessons);
        System.out.println(biologyTeacher.numberOfPupils);
    }
}

class GeneralTeacher {
    protected int numberOfLessons = 3;

    protected int numberOfPupils;
    protected double workLoad;

    public GeneralTeacher(int numberOfPupils, double workLoad) {
        this.numberOfPupils = numberOfPupils;
        this.workLoad = workLoad;
    }

    public void startLesson() {
        System.out.println("звонок для кого?!");
    }
}

class GymTeacher extends GeneralTeacher {
    protected int numberOfLessons = 34;

    public GymTeacher() {
        super(1, 1);
    }

    public void startLesson() {
        super.startLesson();
        System.out.println("по росту стройтесь");
    }

    public void getNumberOfLessons() {
        System.out.println(super.numberOfLessons);
        System.out.println(numberOfLessons);
    }
}

class BiologyTeacher extends GeneralTeacher {
    private int numberOfLabs;

    public BiologyTeacher() {
        // no arguments for the parent class constructor so it called the constructor automatically
        // or call it manually
        super(11, 9);
        numberOfLabs = 10;
    }
}