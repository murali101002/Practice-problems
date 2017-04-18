/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author muralidhar
 */
public class Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for(int i=1;i<=100;i++) list.add(i);
        Random random = new Random();
        random.ints().limit(100).map(i-> (-1*i)).forEach(System.out::println);
    }
}
