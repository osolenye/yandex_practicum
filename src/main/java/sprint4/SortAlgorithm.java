package sprint4;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] array = {1, 3, 464, 334, 434, 1, 2, 3, 4343, 10, 43, 2};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }
}