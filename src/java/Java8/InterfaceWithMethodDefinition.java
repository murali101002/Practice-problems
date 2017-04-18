/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8;

/**
 Java8 allows method definitions on interfaces. In this case implementing multiple interfaces 
 is nothing but extending multiple classes which might result in Diamond problem. 
 Ex: In below example both A and B has method display() with same signature. So current class should override display()
 to avoid the conflict. To use display() in A, we have to use A.super.display()
 */
public class InterfaceWithMethodDefinition implements A,B{
    @Override
    public void display(){
        A.super.display();
        B.super.display();
        System.out.println("Main Class");
    }
    public static void main(String[] args) {
        InterfaceWithMethodDefinition obj = new InterfaceWithMethodDefinition();
        obj.display();
    }
}
