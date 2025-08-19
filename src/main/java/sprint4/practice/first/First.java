package sprint4.practice.first;

public class First{
    public static void main(String[] args) {
        int[] array = {1, 2, 65, 3, 5, 7, 54, 12, 46, 4, 2};
        System.out.println("Индекс искомого элемента: " + find(array, 323));
    }

    public static int find(int[] array, int elem) {
        int index = -1;
        for (int i = 0; i <= array.length -1; i++) {
            if (array[i] == elem) {
                index = i;
            }
        }
        return index;
    }
}