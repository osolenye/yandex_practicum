package sprint2.final_project;
import java.util.Scanner;

public class FinalProject {
    Scanner scanner = new Scanner(System.in);
    public void example() {
        int taskNumber = 1;
        int userInput = scanner.nextInt();
        scanner.nextLine();
        while (userInput != 0) {
        }
    }

    public void printOptions() {
        System.out.println("Чтобы создать задачу нажмите 1");
        System.out.println("Чтобы изменить задачу нажмите 2");
        System.out.println("Чтобы вывести список задач нажмите 3");
        System.out.println("Чтобы получить задачу по идентификатору нажмите 4");
        System.out.println("Чтобы удалить задачу по идентификатору нажмите 5");
        System.out.println("Чтобы удалить все задачи нажмите 6");
        System.out.println("Чтобы получить все подзадачи эпика нажмите 7");
        System.out.println("Чтобы выйти из программы нажмите 0");
    }
}