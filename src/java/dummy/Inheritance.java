/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

/**
 methods with PROTECTED or PRIVATE access specifiers cannot be overrided by the child class. Child class cannot OVERRIDE a 
 inherited method with PROTECTED/PRIVATE. This way you are restricting methods in Child class. In future if the Parent
 class is added with new methods, those methods cannot be reflected in Child class. 
 * 
 * Observe the static and non-static methods cannot be overloaded
 * static methods doesn't require class instance where non-static methods need them.
 */
public class Inheritance {
    public static void main(String[] args) {
        Parent p = new Child();
        Inheritance.foo();
        Inheritance inheritance = new Inheritance();
        inheritance.foo2();
    }
    public static void foo() {
        System.out.println("Test.foo() called ");
    }
    //returns an instance of the class
    public Inheritance foo3(){
        return this;
    }
    //public void foo() { // Compiler Error: cannot redefine foo()
    public void foo2() { 
        System.out.println("Test.foo(int) called ");
    }
}
class Parent{
     void method(){
        System.out.println("Method in Parent");
    }
}
class Child extends Parent{
    @Override
      void method(){
        System.out.println("Method in Child");
    }
}
