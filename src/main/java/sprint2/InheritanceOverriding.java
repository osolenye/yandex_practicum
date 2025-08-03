package sprint2;

public class InheritanceOverriding {
    public void example() {
        Teacher teacher = new Teacher();
        System.out.println(teacher.startLesson());
        GeographyTeacher geographyTeacher = new GeographyTeacher();
        System.out.println(geographyTeacher.startLesson());
    }
}

class Teacher {
    protected String startLesson() {
        return "get your books ready!";
    }
}

class GeographyTeacher extends Teacher{
    @Override
    public String startLesson() {
        return "get your globes ready!";
    }
}
