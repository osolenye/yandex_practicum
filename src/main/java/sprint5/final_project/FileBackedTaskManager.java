package sprint5.final_project;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// instead of copying code from the class just inherit from it and get all code via DRY
public class FileBackedTaskManager extends InMemoryTaskManager implements TaskManager{
    final String DATABASE_FILE = "/home/osolenye/programming/yandex_practicum/src/main/java/sprint5/final_project/database.csv";
    @Override
    public void example() {
        super.example();
    }

    @Override
    public void printOptions() {
        super.printOptions();
    }

    @Override
    public void createTask() {
        super.createTask();
    }

    @Override
    public void createSimpleTask() {

    }

    @Override
    public void createEpicTask() {

    }

    @Override
    public void createSubTask() {

    }

    @Override
    public void printTasks() {
        super.printTasks();
    }

    @Override
    public void changeTask() {
        super.changeTask();
    }

    @Override
    public void changeSimpleTask() {

    }

    @Override
    public void changeEpicTask() {

    }

    @Override
    public void changeSubTask() {

    }

    @Override
    public void getTaskById() {

    }

    @Override
    public void deleteTaskById() {

    }

    @Override
    public void deleteAllTasks() {

    }

    @Override
    public void getAllSubtasksOfEpic() {
        super.getAllSubtasksOfEpic();
    }


    public void save(AbstractTask task) throws IOException {
        if (task.getClass() == Task.class) {
            writeTaskToDB(task);
        } else if (task.getClass() == EpicTask.class) {
            writeEpicTaskToDB((EpicTask) task);
        } else {
            writeSubTaskToDB((SubTask) task);
        }
    }

    void writeTaskToDB(AbstractTask task) throws IOException {
        StringBuilder stringBuilder = buildBasicString(task);
        stringBuilder.append(",");
        stringBuilder.append("null");
        stringBuilder.append(",");
        stringBuilder.append("null");
        writeToDB(stringBuilder);
    }

    void writeEpicTaskToDB(EpicTask task) throws IOException {
        StringBuilder stringBuilder = buildBasicString(task);
        stringBuilder.append(",");
        stringBuilder.append(task.getSubTasks().toString());
        stringBuilder.append(",");
        stringBuilder.append("null");
        writeToDB(stringBuilder);
    }

    void writeSubTaskToDB(SubTask task) throws IOException {
        StringBuilder stringBuilder = buildBasicString(task);
        stringBuilder.append(",");
        stringBuilder.append("null");
        stringBuilder.append(",");
        stringBuilder.append(task.getEpicTask().toString());
        writeToDB(stringBuilder);
    }

    void writeToDB(StringBuilder stringBuilder) throws IOException {
        try (Writer fileWriter = new FileWriter(DATABASE_FILE, true)) {
            fileWriter.write(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    StringBuilder buildBasicString(AbstractTask task) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TaskType.TASK.toString());
        stringBuilder.append(",");
        stringBuilder.append(task.getId());
        stringBuilder.append(",");
        stringBuilder.append(",");
        stringBuilder.append(task.getName());
        stringBuilder.append(",");
        stringBuilder.append(task.getDescription());
        stringBuilder.append(",");
        stringBuilder.append(task.getStatus());
        return stringBuilder;
    }
}
