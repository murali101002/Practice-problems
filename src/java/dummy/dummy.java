/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author muralidhar
 */
public class dummy {

    public static LinkedHashMap<String,String> map = new LinkedHashMap<>();

    public static void main(String args[]) {
        String[] input = {"cheating", "deal", "silent", "teaching", "lead", "dale", "listen"};
        returnList(input);

    }

    public static String returnList(String[] input) {
        for (String value : input) {
            map.put(value, value);
        }
//        System.out.println(map);
        map.keySet().stream().forEach((key) -> {
            char[] value = map.get(key).toCharArray();
            Arrays.sort(value);
//            System.out.println(String.valueOf(value));
            map.put(map.get(key), String.valueOf(value));
        });
        Set<String> values = new HashSet<String>(map.values());
        
        for(String value:values){
            for(String key:map.keySet()){
                if(value.equals(map.get(key))){
                    System.out.println(key);
                }
            }
        }
        return null;
    }
}
