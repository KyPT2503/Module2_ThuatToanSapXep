import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] ints = new int[]{0, 7, 9, -1, 0, 3, -2, -100, 6, -3};
        insertionSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void selectionSort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int tmp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = tmp;
                }
            }
        }
    }

    public static void bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    isSorted = false;
                    int tmp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tmp;
                }
            }
            if (isSorted) return;
        }
    }

    public static void insertionSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int currentElement = ints[i];
            int j;
            for (j = i - 1; j >= 0 && ints[j] > currentElement; j--) {
                ints[j + 1] = ints[j];
            }
            ints[j + 1] = currentElement;
        }
    }
}
