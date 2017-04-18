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
public class HE_DivideArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int i = n;
        while(n>0){
            arr[i-n] = scan.nextInt();
            n--;
        }
        int q = scan.nextInt();
        int d = 1;
        while(q>0){
            d *= scan.nextInt();
            q--;
        }
        for(int num:arr){
            System.out.print(num/d+" ");
        }
    }
}
