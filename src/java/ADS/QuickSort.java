package ADS;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 *
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        int[] arr3 = {54,73,38,33,70,77,41,22,85,57,61,47,66,80,83,96,79,60,26,67,92,20,90,88,56,82,7,64,19,51,39,100,16,49,78,6,46,62,35,86,24,99,31,18,40,42,44,1,95,91,48,34,63,15,71,50,2,58,72,30,5,69,9,74,76,87,3,89,93,68,53,23,59,32,45,29,52,17,11,14,21,10,37,43,75,65,55,27,4,28,94,98,84,25,8,13,97,12,81,36};
        long startTime = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Toatl time for descending order = " + elapsedTime);
        long startTime2 = System.currentTimeMillis();
        quickSort(arr2, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        long stopTime2 = System.currentTimeMillis();
        long elapsedTime2 = stopTime2 - startTime2;
        System.out.println("Toatl time ascending order= " + elapsedTime2);
        long startTime3 = System.currentTimeMillis();
        quickSort(arr3, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        long stopTime3 = System.currentTimeMillis();
        long elapsedTime3 = stopTime3 - startTime3;
        System.out.println("Toatl time randomly sorted= " + elapsedTime3);
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition;
            partition = partition(arr, start, end);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int i = start - 1;
        int temp;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] <= arr[end]) {
                i += 1;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        i += 1;
        temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
}
