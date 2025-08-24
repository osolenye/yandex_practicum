package sprint5.final_project;

public class Task extends AbstractTask {
    public Task(String name, String description) {
        super(name, description);
    }

    public Task() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskType.TASK.toString());
        sb.append(", ");
        sb.append(super.toString());
        return sb.toString();
    }
}

