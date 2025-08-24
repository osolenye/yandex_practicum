package sprint5.final_project;

public interface TaskManager {
    void example();

    void printOptions();

    void createTask();

    Task createSimpleTask();

    EpicTask createEpicTask();

    SubTask createSubTask();

    void printTasks();

    void changeTask();

    void changeSimpleTask();

    void changeEpicTask();

    void changeSubTask();

    void getTaskById();

    void deleteTaskById();

    void deleteAllTasks();

    void getAllSubtasksOfEpic();
}