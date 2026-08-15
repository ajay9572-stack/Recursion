package Shorting;
import java.util.Arrays;

public class RS4 {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;

        // Choose middle element as pivot
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];

        // Partition
        while (start <= end) {

            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        // Recursive calls
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}