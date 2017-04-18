/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8;

/**
 *
 * @author muralidhar
 */
public interface B {
    default void display(){
        System.out.println("Interface B");
    }
}
