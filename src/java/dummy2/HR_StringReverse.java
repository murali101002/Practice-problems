/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy2;

import java.util.Scanner;

/**
 *
 * @author muralidhar
 */
public class HR_StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        long startTime = System.currentTimeMillis();
        System.out.println(reverse(A));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Toatl time for descending order = " + elapsedTime);
        long startTime2 = System.currentTimeMillis();
        System.out.println(reverse2(A));
        long stopTime2 = System.currentTimeMillis();
        long elapsedTime2 = stopTime2 - startTime2;
        System.out.println("Toatl time for descending order = " + elapsedTime2);

    }

    public static boolean reverse2(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean reverse(String str) {
        char[] arr = str.toCharArray();
        int len = str.length();
        for (int i = 0; i <= len / 2; i++) {
            if (arr[len - 1 - i] != arr[i]) {
                return false;
            }

        }
        return true;
    }
}
