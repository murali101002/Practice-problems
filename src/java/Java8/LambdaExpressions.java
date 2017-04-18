/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8;

import java.util.function.BiPredicate;

/**
 *
 * @author muralidhar
 */
public class LambdaExpressions {
    public static void main(String[] args) {
        MathOperation add = (a,b)->a+b;
        MathOperation subtract = (a,b)->a-b;
        MathOperation multiply = (a,b)->a*b;
        MathOperation divide = (a,b)->a/b;
        LambdaExpressions obj = new LambdaExpressions();
        System.out.println(obj.operate(5, 5, add));
        System.out.println(obj.operate(5, 5, multiply));
        System.out.println(obj.operate(5, 5, divide));
        System.out.println(obj.operate(5, 5, subtract));
        Greetings hello = (msg)->System.out.println("Hello "+msg);
        hello.sayHello("Hinder");
    }
    interface Greetings{
        static void sayHello(){
            System.out.println("Hello from interface");
        }
        public void sayHello(String msg);
    }
    interface MathOperation{
        int operation(int a, int b);
    }
    private int operate(int a, int b, MathOperation mathOperation){
      return mathOperation.operation(a, b);
   }
}
