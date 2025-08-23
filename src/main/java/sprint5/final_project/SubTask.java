package sprint5.final_project;

import java.util.Objects;

public class SubTask extends Task {
    EpicTask epicTask;

    public SubTask(String name, String description, EpicTask epicTask) {
        super(name, description);
        this.epicTask = epicTask;
    }

    public SubTask(EpicTask epicTask) {
        this.epicTask = epicTask;
    }
    public SubTask() {
    }

    public EpicTask getEpicTask() {
        return epicTask;
    }

    public void setEpicTask(EpicTask epicTask) {
        this.epicTask = epicTask;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SubTask subTask = (SubTask) o;
        return Objects.equals(epicTask, subTask.epicTask);
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.name, super.description, super.id, super.status, epicTask);
    }

    @Override
    public String toString() {
        return super.toString() + "SubTask{" +
                "epicTask=" + epicTask +
                '}';
    }
}
