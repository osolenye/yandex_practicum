package sprint3;

import java.util.ArrayList;
import java.util.List;

// final class can't be inherited
// final method can be overriden
// final variables can't be re assigned

public class FinalModificator {
    public void example() {
        final int count = 1232;
        final Book book = new Book();
        book.name = "ye";
        Book book1 = new Book();
        // can change the state of the final but not the object itself

        // инициализация final-переменной:
        final List<Integer> incomeBook = new ArrayList<>();

        System.out.println(sum(incomeBook));

        // изменение состояния объекта:
        incomeBook.add(4300);
        incomeBook.add(1500);

        System.out.println(sum(incomeBook));
    }

    public static int sum(List<Integer> list) {
        int sum = 0;

        for (int i : list) {
            sum = sum + i;
        }

        return sum;
    }
}

class Book {
    String name;
}