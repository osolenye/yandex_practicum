package sprint5.final_project;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;

// instead of copying code from the class just inherit from it and get all code via DRY
public class FileBackedTaskManager extends InMemoryTaskManager implements TaskManager{
    final String DATABASE_FILE = "/home/osolenye/programming/yandex_practicum/src/main/java/sprint5/final_project/database.csv";
    private ArrayList<Task> tasks = new ArrayList<>();
    private HashMap<Integer, EpicTask> epicTasks = new HashMap<>();
    private ArrayList<SubTask> subTasks = new ArrayList<>();

    HashMap<Integer, Node> nodes = new HashMap<>();
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    public Node head;
    public Node tail;
    public Node current;
    int size = 0;


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
    public Task createSimpleTask() {
        Task task =  super.createSimpleTask();
        try {
            save(task);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("createsimepltask");
        return task;
    }

    @Override
    public EpicTask createEpicTask() {
        EpicTask task =  super.createEpicTask();
        try {
            save(task);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return task;
    }

    @Override
    public SubTask createSubTask() {
        SubTask task =  super.createSubTask();
        try {
            save(task);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return task;
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
    public Task changeSimpleTask() {
        Task task = super.changeSimpleTask();

    }

    @Override
    public EpicTask changeEpicTask() {

    }

    @Override
    public SubTask changeSubTask() {

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
        StringBuilder stringBuilder = buildBasicString(task, TaskType.TASK);
        stringBuilder.append(",");
        stringBuilder.append("null");
        stringBuilder.append(",");
        stringBuilder.append("null");
        writeToDB(stringBuilder);
    }

    void writeEpicTaskToDB(EpicTask task) throws IOException {
        StringBuilder stringBuilder = buildBasicString(task,  TaskType.EPIC);
        stringBuilder.append(",");
        stringBuilder.append(task.getSubTasks().toString());
        stringBuilder.append(",");
        stringBuilder.append("null");
        writeToDB(stringBuilder);
    }

    void writeSubTaskToDB(SubTask task) throws IOException {
        StringBuilder stringBuilder = buildBasicString(task,   TaskType.SUBTASK);
        stringBuilder.append(",");
        stringBuilder.append("null");
        stringBuilder.append(",");
        stringBuilder.append(task.getEpicTask().toString());
        writeToDB(stringBuilder);
    }

    void writeToDB(StringBuilder stringBuilder) throws IOException {
        try (Writer fileWriter = new FileWriter(DATABASE_FILE, true)) {
            fileWriter.write(stringBuilder.toString());
            fileWriter.write("\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    StringBuilder buildBasicString(AbstractTask task, TaskType type) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(type.toString());
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
