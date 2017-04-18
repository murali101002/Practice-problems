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
public class HR_Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        String[] arr = new String[n2];
        //String.valueOf(false);
        int res = 1;
        if(n1<0 || n2<0){
            throw new Exception(n1+" and "+n2+" should not be negative");
        }else{
            for(int i=1;i<=n2;i++){
                res *= n1;
            }
            System.out.println(res);
        }
    }
}
