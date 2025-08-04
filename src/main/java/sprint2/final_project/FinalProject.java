package sprint2.final_project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FinalProject {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Task> tasks = new ArrayList<>();
    private HashMap<Integer, EpicTask> epicTasks = new HashMap<>();
    private ArrayList<SubTask> subTasks = new ArrayList<>();

    public void example() {
        System.out.println("Чтобы завершить программу нажмите 0");
        System.out.println("Чтобы начать нажмите 1");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        while (userInput != 0) {
            printOptions();
            userInput = scanner.nextInt();
            scanner.nextLine();
            if (userInput == 1) {
                createTask();
            } else if (userInput == 2) {
                changeTask();
            } else if (userInput == 3) {
                printTasks();
            }
        }
    }

    private void printOptions() {
        System.out.println("Чтобы создать задачу нажмите 1");
        System.out.println("Чтобы изменить задачу нажмите 2");
        System.out.println("Чтобы вывести список задач нажмите 3");
        System.out.println("Чтобы получить задачу по идентификатору нажмите 4");
        System.out.println("Чтобы удалить задачу по идентификатору нажмите 5");
        System.out.println("Чтобы удалить все задачи нажмите 6");
        System.out.println("Чтобы получить все подзадачи эпика нажмите 7");
        System.out.println("Чтобы выйти из программы нажмите 0");
    }

    private void createTask() {
        System.out.println("Чтобы создать задачу нажмите 1");
        System.out.println("Чтобы создать эпик задачу нажмите 2");
        System.out.println("Чтобы создать под задачу нажмите 3");

        int  userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
            createSimpleTask();
        } else if (userInput == 2) {
            createEpicTask();
        } else if (userInput == 3) {
            createSubTask();
        }
    }
    private void createSimpleTask() {
        System.out.println("Имя задачи:");
        String name = scanner.nextLine();

        System.out.println("Описание задачи:");
        String description = scanner.nextLine();

        Task task = new Task(name, description);
        tasks.add(task);
    }
    private void createEpicTask() {
        System.out.println("Имя задачи:");
        String name = scanner.nextLine();

        System.out.println("Описание задачи:");
        String description = scanner.nextLine();

        EpicTask epicTask = new EpicTask(name, description);
        epicTasks.put(epicTask.getId(), epicTask);
    }
    private void createSubTask() {
        System.out.println("Имя задачи:");
        String name = scanner.nextLine();

        System.out.println("Описание задачи:");
        String description = scanner.nextLine();


        System.out.println("Айди эпик задачи:");
        int id = scanner.nextInt();
        scanner.nextLine();

        EpicTask epicTask = epicTasks.get(id);

        SubTask subTask = new SubTask(name, description, epicTask);

        subTasks.add(subTask);
    }


    private void printTasks() {
        System.out.println("Чтобы вывести задачи введите 1");
        System.out.println("Чтобы вывести epic задачи введите 2");
        System.out.println("Чтобы вывести sub задачи введите 3");

        int  userInput = scanner.nextInt();
        scanner.nextLine();
        if  (userInput == 1) {
            System.out.println(tasks.toString());
        } else if (userInput == 2) {
            System.out.println(epicTasks.toString());
        } else if (userInput == 3) {
            System.out.println(subTasks.toString());
        }
    }

    private void changeTask() {
        System.out.println("Чтобы изменить задачу нажмите 1");
        System.out.println("Чтобы изменить epic задачу нажмите 2");
        System.out.println("Чтобы изменить sub задачу нажмите 3");

        int userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
            changeSimpleTask();
        } else if (userInput == 2) {
            changeEpicTask();
        } else if (userInput == 2) {
            changeSubTask();
        }
    }
    private void changeSimpleTask() {
        System.out.println("Введите айди задачи:");
        int taskId = scanner.nextInt();
        scanner.nextLine();

        Task taskToChange = new Task();
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                taskToChange.setName(task.getName());
                taskToChange.setDescription(task.getDescription());
                taskToChange.setId(taskId);
                taskToChange.setStatus(task.getStatus());
                tasks.remove(task);
                break;
            }
        }
        String name;
        String description;
        Task.TaskStatus taskStatus;
        System.out.println("new name: ");
        name = scanner.nextLine();
        System.out.println("new description: ");
        description = scanner.nextLine();
        System.out.println("new status: ");
        taskStatus = Task.TaskStatus.valueOf(scanner.nextLine());

        taskToChange.setName(name);
        taskToChange.setDescription(description);
        taskToChange.setStatus(taskStatus);
        tasks.add(taskToChange);
    }

    private void changeEpicTask() {
        System.out.println("Введите айди задачи:");
        int taskId = scanner.nextInt();
        scanner.nextLine();

        EpicTask taskToChange = new EpicTask();
        for (EpicTask epicTask : epicTasks.values()) {
            if (epicTask.getId() == taskId) {
                taskToChange.setName(epicTask.getName());
                taskToChange.setDescription(epicTask.getDescription());
                taskToChange.setId(taskId);
                taskToChange.setStatus(epicTask.getStatus());
                taskToChange.setSubTasks(epicTask.getSubTasks());
                epicTasks.remove(epicTask);
                break;
            }
        }

        String name;
        String description;
        Task.TaskStatus taskStatus;
        System.out.println("new name: ");
        name = scanner.nextLine();
        System.out.println("new description: ");
        description = scanner.nextLine();
        System.out.println("new status: ");
        taskStatus = Task.TaskStatus.valueOf(scanner.nextLine());

        taskToChange.setName(name);
        taskToChange.setDescription(description);
        taskToChange.setStatus(taskStatus);
        epicTasks.put(taskToChange.getId(), taskToChange);
    }


    private void changeSubTask() {
        System.out.println("Введите айди задачи:");
        int taskId = scanner.nextInt();
        scanner.nextLine();

        SubTask taskToChange = new SubTask();
        for (SubTask subTask : subTasks) {
            if (subTask.getId() == taskId) {
                taskToChange.setName(subTask.getName());
                taskToChange.setDescription(subTask.getDescription());
                taskToChange.setId(taskId);
                taskToChange.setStatus(subTask.getStatus());
                subTasks.remove(subTask);
                break;
            }
        }
        String name;
        String description;
        Task.TaskStatus taskStatus;
        System.out.println("new name: ");
        name = scanner.nextLine();
        System.out.println("new description: ");
        description = scanner.nextLine();
        System.out.println("new status: ");
        taskStatus = Task.TaskStatus.valueOf(scanner.nextLine());

        taskToChange.setName(name);
        taskToChange.setDescription(description);
        taskToChange.setStatus(taskStatus);
        subTasks.add(taskToChange);
    }
}