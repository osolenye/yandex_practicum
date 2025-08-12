package sprint4;

public class SearchAlgorithm {
    public static void main(String[] args) {
        int[] array = {2, 43, 12, 43, 99, 10, 0, 2, 2,1, 3,1,3232};
        System.out.println(getMin(array));

        int[] array2 = {1, 2, 5, 8, 12, 13, 20, 22, 24, 30, 32};
        System.out.println(findBinary(array2, 22));
    }

    public static int getMin(int[] array) {
        int min = array[0];

        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    public static int findBinary(int[] array, int elem) {
        int index = -1;

        int low = 0;
        int high = array.length -1;
        int mid = low + ((high - low)/2);

        while (low <= high) {
            mid = low + ((high - low)/2);
            if (array[mid] < elem ) {
                low = mid + 1;
            } else if (array[mid] > elem) {
                high = mid - 1;
            } else if (array[mid] == elem) {
                return mid;
            }
        }
        return mid;
    }
}
