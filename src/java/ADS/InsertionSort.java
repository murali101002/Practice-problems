/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;

import java.util.Arrays;

/**
 *
 * @author muralidhar
 */
/*
Complexity: O(n^2). Suitable for small arrays or almost sorted arrays
*/
public class InsertionSort {

    static class InsertSort {

        public int[] insertionSort(int[] arr) {
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                    flag = true;
                }
                arr[j + 1] = key;
                if (flag) {
                    for (int n : arr) {
                        System.out.print(n + " ");
                    }
                    System.out.println("");
                    flag = false;
                }
            }

            return null;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 1, 9, 4, 8, 0, 7};
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println("");
        InsertSort insertSort = new InsertSort();
        System.out.println(Arrays.toString(insertSort.insertionSort(arr)));
    }

}
