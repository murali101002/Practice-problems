/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;

import java.util.ArrayList;

/**
 *
 * @author muralidhar
 */
public class LeastCommonString {

    public static void main(String[] args) {
        System.out.println(lcs("abcde", "abcd"));
    }

    public static String lcs(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        if (aLen == 0 || bLen == 0) {
            return "";
        } else if (a.charAt(aLen - 1) == b.charAt(bLen - 1)) {
            return lcs(a.substring(0, aLen - 1), b.substring(0, bLen - 1))
                    + a.charAt(aLen - 1);
        } else {
            String x = lcs(a, b.substring(0, bLen - 1));
            System.out.println("X = " + x);
            String y = lcs(a.substring(0, aLen - 1), b);
            System.out.println("Y = " + y);
            return (x.length() > y.length()) ? x : y;
        }
    }
}
