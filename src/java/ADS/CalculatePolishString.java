/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author muralidhar
 */
public class CalculatePolishString {
    Stack<Integer> stack = new Stack();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expr = scan.nextLine();
        CalculatePolishString obj = new CalculatePolishString();
        int result = obj.calculate(expr);
        System.out.println(result);
    }

    private int calculate(String expr) {
//        if(expr.length()!=3) return 0;
        char[] ch = expr.toCharArray();
        String[] str = expr.split("\\s");
        for(String s:str){
            switch(s){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop()+stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    stack.push(stack.pop()/stack.pop());
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
