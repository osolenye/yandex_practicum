package sprint4.final_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InMemoryTaskManager implements TaskManager, HistoryManager {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Task> tasks = new ArrayList<>();
    private HashMap<Integer, EpicTask> epicTasks = new HashMap<>();
    private ArrayList<SubTask> subTasks = new ArrayList<>();

    List<AbstractTask> history = new ArrayList<>();

    @Override
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
            } else if (userInput == 4) {
                getTaskById();
            } else if (userInput == 5) {
                deleteTaskById();
            } else if (userInput == 6) {
                deleteAllTasks();
            } else if (userInput == 7) {
                getAllSubtasksOfEpic();
            } else if (userInput == 8) {
                System.out.println(getHistory());
            }
        }
    }

    @Override
    public void printOptions() {
        System.out.println("Чтобы создать задачу нажмите 1");
        System.out.println("Чтобы изменить задачу нажмите 2");
        System.out.println("Чтобы вывести список задач нажмите 3");
        System.out.println("Чтобы получить задачу по идентификатору нажмите 4");
        System.out.println("Чтобы удалить задачу по идентификатору нажмите 5");
        System.out.println("Чтобы удалить все задачи нажмите 6");
        System.out.println("Чтобы получить все подзадачи эпика нажмите 7");
        System.out.println("Чтобы получить историю просмотра задач нажмите 8");
        System.out.println("Чтобы выйти из программы нажмите 0");
    }

    @Override
    public void createTask() {
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

    @Override
    public void createSimpleTask() {
        System.out.println("Имя задачи:");
        String name = scanner.nextLine();

        System.out.println("Описание задачи:");
        String description = scanner.nextLine();

        Task task = new Task(name, description);
        tasks.add(task);
    }
    @Override
    public void createEpicTask() {
        System.out.println("Имя задачи:");
        String name = scanner.nextLine();

        System.out.println("Описание задачи:");
        String description = scanner.nextLine();

        EpicTask epicTask = new EpicTask(name, description);
        epicTasks.put(epicTask.getId(), epicTask);
    }

    @Override
    public void createSubTask() {
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

    @Override
    public void printTasks() {
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

    @Override
    public void changeTask() {
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

    @Override
    public void changeSimpleTask() {
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

    @Override
    public void changeEpicTask() {
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

    @Override
    public void changeSubTask() {
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

    @Override
    public void getTaskById() {
        System.out.println("Введите тип задачи:");
        System.out.println("1 - обычная задача");
        System.out.println("2 - epic задача");
        System.out.println("3 - sub задача");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите айди задачи:");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (type == 1) {
            for (Task task : tasks) {
                if (task.getId() == id) {
                    System.out.println(task);
                    AbstractTask abstractTask = task;
                    if (history.size() >= 10) {
                        history.remove(0);
                        history.add(abstractTask);
                    } else {
                        history.add(abstractTask);
                    }
                    return;
                }
            }
            System.out.println("Задача не найдена");
        } else if (type == 2) {
            EpicTask epicTask = epicTasks.get(id);
            if (epicTask != null) {
                System.out.println(epicTask);
                AbstractTask abstractTask = epicTask;
                if (history.size() >= 10) {
                    history.remove(0);
                    history.add(abstractTask);
                } else {
                    history.add(abstractTask);
                }
            } else {
                System.out.println("Epic задача не найдена");
            }
        } else if (type == 3) {
            for (SubTask subTask : subTasks) {
                if (subTask.getId() == id) {
                    System.out.println(subTask);
                    AbstractTask abstractTask = subTask;
                    if (history.size() >= 10) {
                        history.remove(0);
                        history.add(abstractTask);
                    } else {
                        history.add(abstractTask);
                    }
                    return;
                }
            }
            System.out.println("Sub задача не найдена");
        }
    }

    @Override
    public void deleteTaskById() {
        System.out.println("Введите тип задачи для удаления:");
        System.out.println("1 - обычная задача");
        System.out.println("2 - epic задача");
        System.out.println("3 - sub задача");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите айди задачи:");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (type == 1) {
            tasks.removeIf(task -> task.getId() == id);
            System.out.println("Удалено (если существовало).");
        } else if (type == 2) {
            epicTasks.remove(id);
            System.out.println("Удалено (если существовало).");
        } else if (type == 3) {
            subTasks.removeIf(subTask -> subTask.getId() == id);
            System.out.println("Удалено (если существовало).");
        }
    }

    @Override
    public void deleteAllTasks() {
        tasks.clear();
        epicTasks.clear();
        subTasks.clear();
        System.out.println("Все задачи удалены.");
    }

    @Override
    public void getAllSubtasksOfEpic() {
        System.out.println("Введите айди epic задачи:");
        int id = scanner.nextInt();
        scanner.nextLine();

        EpicTask epicTask = epicTasks.get(id);
        if (epicTask != null) {
            System.out.println(epicTask.getSubTasks());
        } else {
            System.out.println("Epic задача не найдена.");
        }
    }



    // implelemnting history mamanger interface
    @Override
    public List<AbstractTask> getHistory() {
        return history;
    }

    @Override
    public void addTask(AbstractTask task) {
    }

    @Override
    public void remove(int id) {

    }
}