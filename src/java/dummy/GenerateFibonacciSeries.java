/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.util.Scanner;

/**
 *
 * @author muralidhar
 */
public class GenerateFibonacciSeries {
    static GenerateFibonacciSeries obj = new GenerateFibonacciSeries();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String k = obj.generateFibUptoN(n, 72);
        System.out.println(k);
    }

    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public String generateFibUptoN(int n, int m){
        int res = 0;
        String result = "";
        for (int i = 1; i <= n; i++) {
            res = fibonacci(i);
            if(res>=m){
                break;
            }
            result += res+" ";
        }
        return result;
    }
}
