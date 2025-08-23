package sprint5.final_project;

import java.util.Objects;

public class AbstractTask {
    protected String name;
    protected String description;
    protected int id;
    protected Task.TaskStatus status;


    enum TaskStatus {
        NEW, IN_PROGRESS, DONE
    }


    public AbstractTask(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = this.hashCode();
        this.status = Task.TaskStatus.NEW;
    }

    public AbstractTask() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Task.TaskStatus getStatus() {
        return status;
    }

    public void setStatus(Task.TaskStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(name, task.name) && Objects.equals(description, task.description) && status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, id, status);
    }

    @Override
    public String toString() {
        return "Task{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", id=" + id + ", status=" + status + '}';
    }
}
