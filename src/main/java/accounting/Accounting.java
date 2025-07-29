package accounting;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Accounting {
    Scanner scanner =  new Scanner(System.in);
    public void example() {
//        int userInput = scanner.nextInt();
//        scanner.nextLine();
//        while (userInput != 0) {
//
//        }
          String[] lines = readFileContents("D:\\programming\\yandex_practicum\\src\\main\\java\\accounting\\m.202101.csv").split("\n");
          for (String line : lines) {
              System.out.println(line);
              System.out.println("new line");
          }
    }

    private String readFileContents(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            return null;
        }
    }
}