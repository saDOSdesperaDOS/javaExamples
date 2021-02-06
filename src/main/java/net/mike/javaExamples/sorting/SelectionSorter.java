package net.mike.javaExamples.sorting;

public class SelectionSorter {
    public static int min(int[] array, int step) {
        int min = array[step];
        int index = step;
        for (int i = ++step; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
                step++;
            }
        }
        return index;
    }
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = min(array, i);
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

}
