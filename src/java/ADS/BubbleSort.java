/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;

/**
 *
 * @author muralidhar
 */
/*
Its a Brute force. Swapping happens every time when the current element is lower than anyother element in the array.
More than one swap operation may happen per iteration.
Complexity: O(n^2)
*/
public class BubbleSort {

    static class BubSort {

        public void bubbleSort(int[] array) {
            int arrLen = array.length;
            int temp;
            boolean flag = false;
            for (int i = 0; i < arrLen - 1; i++) {
                for (int j = i + 1; j < arrLen; j++) {
                    if (array[j] < array[i]) {
                        flag = true;
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
                if (flag) {
                    for (int n : array) {
                        System.out.print(n + " ");
                    }
                    System.out.println("");
                    flag = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 1, 9, 4, 8, 0, 7};
        BubSort selectSort = new BubSort();
        selectSort.bubbleSort(arr);
    }
}
