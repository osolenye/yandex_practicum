package type_importance;

public class PrimitivesAndClasses {
    public void example() {
        // primitives
//        long incorrect = 9 999 999_999; // так получим ошибку
        long correct = 9_999_999_9991L; // это корректная запись
        long anotherCorrect = 99999; // число в диапазоне int, запись корректна без L
    /* При записи больших чисел можно использовать символ "". Так их легче читать.
    Сам символ будет проигнорирован и не повлияет на сохраняемое значение. */

        double number = 4.7E-23;
        System.out.println(number);

        //symbols
        char letter = '1';
        System.out.println(letter);

        // boolean
        boolean youAreGay = true;

    }
}
