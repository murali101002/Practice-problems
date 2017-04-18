/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author muralidhar
 */
public class CountWays_Stairs {
    
  public static void main(String[] args) throws IOException {
//    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s=":)";
//    while ((s = in.readLine()) != null) {
      System.out.println(balance(s));
      
//    }
    
  }
  public static String balance(String s){
          char[] arr = s.toCharArray();
          boolean flag = false;
          for(int i=0;i<arr.length;i++){
              if(arr[i] == '(') flag = true;
              else if(arr[i] == ')') flag = false;
          }
          
          if(s.contains(":(") || s.contains(":)") ||s.equals("")||s.contains(":") ||s.matches("^[a-z]+")){
              System.out.println("YES");
          }else if(!flag){
            return "NO";   
          }
          return "";
    }
  }
    

