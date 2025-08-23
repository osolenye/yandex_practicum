package sprint5.final_project;

import java.util.ArrayList;
import java.util.Objects;

public class EpicTask extends Task {
    ArrayList<SubTask> subTasks = new ArrayList<>();

    public EpicTask(String name, String description) {
        super(name, description);
        this.subTasks = subTasks;
    }

    public EpicTask(ArrayList<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public EpicTask() {
    }

    public ArrayList<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(ArrayList<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EpicTask epicTask = (EpicTask) o;
        return Objects.equals(subTasks, epicTask.subTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.name, super.description, super.id, super.status, subTasks);
    }

    @Override
    public String toString() {
        return super.toString() +
                "subTasks=" + subTasks +
                '}';
    }
}
