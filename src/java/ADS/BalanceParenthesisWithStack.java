/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author muralidhar
 */
public class BalanceParenthesisWithStack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }
        System.out.println(Arrays.toString(balanceParenthesis(arr)));
        String str = "{[}]";
        System.out.println(balanceBrackets(str));
    }

    public static boolean balanceBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        char[] charArr = str.toCharArray();
        for (char ch : charArr) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (!stack.isEmpty()) {
                        if (stack.pop() != '(') {
                            return false;
                        }
                    }
                    break;
                case '}':
                    if (!stack.isEmpty()) {
                        if (stack.pop() != '{') {
                            return false;
                        }
                    }
                    break;
                case ']':
                    if (!stack.isEmpty()) {
                        if (stack.pop() != '[') {
                            return false;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }

    private static String[] balanceParenthesis(String[] arr) {
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Stack<Character> stack = new Stack<>();
            String str = arr[i];
            char[] charArr = str.toCharArray();
            res[i] = "YES";
            for (char ch : charArr) {
                switch (ch) {
                    case '(':
                    case '{':
                    case '[':
                        stack.push(ch);
                        break;
                    case ')':
                        if (!stack.isEmpty()) {
                            if (stack.pop() != '(') {
                                res[i] = "NO";
                            }
                        }
                        break;
                    case '}':
                        if (!stack.isEmpty()) {
                            if (stack.pop() != '{') {
                                res[i] = "NO";
                            }
                        }
                        break;
                    case ']':
                        if (!stack.isEmpty()) {
                            if (stack.pop() != '[') {
                                res[i] = "NO";
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
//            if(stack.isEmpty()) res[i] = "YES";
//            else res[i] = "NO";
        }
        return res;
    }
}
