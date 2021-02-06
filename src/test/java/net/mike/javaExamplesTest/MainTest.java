package net.mike.javaExamplesTest;

import static net.mike.javaExamples.sorting.BubbleSorter.bubbleSort;
import static net.mike.javaExamples.sorting.SelectionSorter.selectionSort;

public class MainTest {
    public static void main(String... args) {
       int[] a = {1,5,234,12,2,56};
        for (int i:selectionSort(a)) {
            System.out.println(i);
        };
    }
}
