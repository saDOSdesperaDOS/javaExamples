package net.mike.javaExamples.sorting;

public class BubbleSorter {
    public static int[] bubbleSort(int[] array) {
        int tmp = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length ; i++) {
                if (array[i] < array[i-1]) {
                    tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                    isSorted = false;
                }
            }
        }
        return array;
    }
}
