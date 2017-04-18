/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author muralidhar
 */
public class HE_CaeserCipher {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int num = Integer.parseInt(line);
        while (num-- > 0) {
            String a = br.readLine();
            String b = br.readLine();
            System.out.println(findK(a, b));
        }
    }

    public static int findK(String a, String b) {
        int k = 0, diff = 0;

        if (a.length() != b.length()) {
            return -1;
        }
        int[] arr = new int[b.length()];
        char[] a2Char = a.toUpperCase().toCharArray();
        char[] b2Char = b.toUpperCase().toCharArray();

        for (int i = 0; i < a.length(); i++) {
            diff = Math.abs(a2Char[i] - b2Char[i]);
//            System.out.println(diff);
            arr[i] = diff;
        }
        for (int n : arr) {
            if (n != diff) {
                return -1;
            }
        }
        return diff;
    }
}
