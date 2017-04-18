/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author muralidhar
 */
public class TreeMapDemo {
    
    public static void main(String[] args) {
//        TreeSet<Integer> set = new TreeSet<>();
//        HashSet<Integer> set = new HashSet<>();
//        TreeSet<Integer> set = new TreeSet<>();
//        LinkedHashSet<Integer,String> map = new LinkedHashSet<>();
        HashMap<Integer,String> map = new HashMap<>();
//        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(5, "abcd");
        map.put(7, "abcd");
        map.put(11, "abcd");
        map.put(6, "abcd");
        map.put(2, "abcd");
        map.put(3, "abcd");
        map.put(8, "abcd");
        map.put(9, "abcd");
        map.put(4, "abcd");
        map.put(1, "abcd");
        String abc = "skjfhsjnvdkjfhjnkdjk";
        char[] cfd = abc.toCharArray();
        Arrays.sort(cfd);
        StringBuilder sb = new StringBuilder();
        sb.append(cfd);
        sb.reverse();
        System.out.println(map);
    }
    
}
