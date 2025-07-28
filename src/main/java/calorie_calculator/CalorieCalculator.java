package calorie_calculator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CalorieCalculator {
    Scanner scanner = new Scanner(System.in);
    StepTracker stepTracker = new StepTracker();

    public void example() {
        int userInput = scanner.nextInt();
        scanner.nextLine();
        while (userInput != 0) {
            printMenu();
            userInput = scanner.nextInt();
            scanner.nextLine();
            if (userInput == 0) {
                break;
            } else if (userInput == 1) {
                stepCountInput();
            } else if (userInput == 2) {
                getMonthStats();
            }
        }
    }

    public void printMenu() {
        System.out.println("Чтобы ввести количество шагов за определенный день нажмите 1");
        System.out.println("Чтобы вывести статистику за месяц нажмите 2");
        System.out.println("Чтобы изменить цель по количеству шагов за день нажмите 3");
        System.out.println("Чтобы выйти из приложения нажмите 0");
    }

    public void stepCountInput() {
        System.out.println("Введите номер месяца: ");
        String monthNumber =  scanner.nextLine();
        System.out.println("Введите номер дня: ");
        String dayNumber =  scanner.nextLine();
        System.out.println("Введите количество шагов: ");
        String stepCounter =  scanner.nextLine();

        if (!stepTracker.getMonthToData().containsKey(monthNumber)) {
            HashMap<Integer, MonthData> monthToData = stepTracker.getMonthToData();
            MonthData monthData = new MonthData();
            ArrayList<Day> days = new ArrayList<>();

            Day day = new Day();
            day.setStepCounter(Integer.parseInt(stepCounter));
            days.add(Integer.parseInt(dayNumber) - 1, day);

            monthData.setDays(days);

            monthToData.put(Integer.parseInt(monthNumber) - 1, monthData);

            stepTracker.setMonthToData(monthToData);
        }
    }

    public void getMonthStats() {
        String monthNumberString = scanner.nextLine();
        int monthNumber =  Integer.parseInt(monthNumberString);
        MonthData monthData = stepTracker.getMonthToData().get(monthNumber);
        ArrayList<Day> days = monthData.getDays();
        int num;
        int stepForMonth = 0;
        for (Day day : days) {
            num = 1;
            System.out.println(num + " день: " + day.getStepCounter());
            stepForMonth += day.getStepCounter();
        }
        System.out.println(stepForMonth);
        System.out.println(stepForMonth / 30);
        System.out.println("km: " + stepForMonth * 0.75);
        System.out.println("calories spet: " + (stepForMonth * 50) / 1000);
    }

}
