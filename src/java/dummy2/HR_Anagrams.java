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
public class HR_Anagrams {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        if(a.length()==b.length()){
            char[] a1 = a.toLowerCase().toCharArray();
            char[] b1 = b.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            for(int i=0;i<a1.length;i++){
                if(a1[i]!=b1[i]) return false;
            }
            return true;
        }else return false;
        
        
    }
}
