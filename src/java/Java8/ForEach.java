/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author muralidhar
 */
public class ForEach {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for(int i=1;i<=100;i++) myList.add(i);
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("Number is "+t);
            }
        });
    }
    
}
