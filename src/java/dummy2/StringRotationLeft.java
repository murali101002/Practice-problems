/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author muralidhar
 */
public class StringRotationLeft {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            if (n > i) {
                arr[size - n + i] = in.nextInt();
            } else {
                arr[i - n] = in.nextInt();
            }
            System.out.println(Arrays.toString(arr));
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
