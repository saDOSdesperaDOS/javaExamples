package net.mike.javaExamples.sortings;

public class OuickSort {
    public static void main(String... args) {
        int[] arr = {23, 45, 3, 6 ,12, 22, 4};
        QuickSort(arr, 0, arr.length - 1);
        for (int n: arr ) {
            System.out.print(n + ", ");
        }
    }

    public static void QuickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            QuickSort(arr, from, divideIndex - 1);
            QuickSort(arr, divideIndex, to);
        }
    }

    public static int partition(int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;
        int pivot = arr[from];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
