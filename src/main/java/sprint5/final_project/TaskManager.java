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

    Task changeSimpleTask();

    EpicTask changeEpicTask();

    SubTask changeSubTask();

    void getTaskById();

    void deleteTaskById();

    void deleteAllTasks();

    void getAllSubtasksOfEpic();
}