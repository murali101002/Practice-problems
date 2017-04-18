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
/*Selection sort selects the minimum elemengt in the array and swaps it with the 1st element. So by end of every iteration
the lowest element moves to its right place.
ONLY ONE SWAP PER ITERATION - Useful when memory operations were expensive
Complexity: Although O(n^2), reduces memory space since less swap operations.
*/
public class SelectionSort {

    static class SelectSort {

        public int[] selectionSort(int[] arr) {
            int min, temp;
            boolean flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                        flag = true;
                    }
                }
                if (flag) {
                    temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                    for (int n : arr) {
                        System.out.print(n + " ");
                    }
                    System.out.println("");
                    flag = false;
                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 1, 9, 4, 8, 0, 7};
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println("");
        SelectSort selectSort = new SelectSort();
        System.out.println(Arrays.toString(selectSort.selectionSort(arr)));
    }

}
