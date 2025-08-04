package sprint2.final_project;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalProject {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<EpicTask> epicTasks = new ArrayList<>();
    private ArrayList<SubTask> subTasks;

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
        System.out.println("Чтобы создать под задачу нажмите 1");
        System.out.println("Чтобы создать эпик задачу нажмите 1");

        int  userInput = scanner.nextInt();
        scanner.nextLine();
        createSimpleTask();
    }
    private void createSimpleTask() {
        System.out.println("Имя задачи:");
        String name = scanner.nextLine();

        System.out.println("Описание задачи:");
        String description = scanner.nextLine();

        Task task = new Task(name, description);
        System.out.println(task.toString());
    }
}