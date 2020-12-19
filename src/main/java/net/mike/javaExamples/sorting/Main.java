package net.mike.javaExamples.sorting;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
       int[] array = {54, 5, 99, 65, 16, 27};
        for (int n: array) {
            System.out.print(n + " ");
        }
        System.out.println();
        int t11 = LocalTime.now().getNano();
        for (int n: bubbleSort(array)) {
            System.out.print(n + " ");
        }
        int t22 = LocalTime.now().getNano();
        System.out.println();
        System.out.println(t22);
        System.out.println(t11);

        System.out.println(t22 - t11);
       int t1 = LocalTime.now().getNano();
        for (int n: selectionSort(array)) {
            System.out.print(n + " ");
        }
        int t2 = LocalTime.now().getNano();
        System.out.println();
        System.out.println(t2);
        System.out.println(t1);
        System.out.println(t2 - t1);


    }

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
