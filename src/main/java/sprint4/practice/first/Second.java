package sprint4.practice.first;

import java.util.Random;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        int userGuess = -1;

        // Считывайте числа от пользователя пока не найдёте число, равное target
        while (userGuess != target) {
            System.out.println(target);
            userGuess = s.nextInt();
            s.nextLine();
            if (userGuess == target) {
                System.out.println("congratulations!");
            } else if (userGuess > target) {
                System.out.println("your guess is bigger than the target number");
            } else if (userGuess < target) {
                System.out.println("your guess is smaller than the target number");
            }
        }
    }

}
