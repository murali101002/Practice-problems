/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy2;

import dummy.GenerateFibonacciSeries;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author muralidhar
 */
public class EncodeDecode {
    static LinkedHashMap<String,Character> innerMap = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int[] asciiCodes = generateAscii(input);
        String compressedString = compression(asciiCodes);
        String decompress = decompress(compressedString);
        System.out.println(decompress);
    }

    private static int[] generateAscii(String input) {
        char[] charArr = input.toCharArray();
        int[] asciiarr = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            asciiarr[i] = charArr[i];
        }
        return asciiarr;
    }

    private static String compression(int[] asciiCodes) {
        int max = Arrays.stream(asciiCodes).max().getAsInt();
        String fibMap = generateFibSeries(max, asciiCodes);
        System.out.println(fibMap);
        return fibMap;
    }

    private static String generateFibSeries(int max, int[] asciiCodes) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        String abc = "";
        List<String> compressedStrings = new ArrayList();
        GenerateFibonacciSeries obj = new GenerateFibonacciSeries();
        String result = "";
        StringBuilder encodeString = new StringBuilder();
        for (int i = 0; i < asciiCodes.length; i++) {
            result = obj.generateFibUptoN(asciiCodes[i], asciiCodes[i]);
            String[] strArr = result.split("\\s");
            int[] intArr = new int[strArr.length];
            for (int j=0;j<strArr.length;j++) {
                map.put(Integer.parseInt(strArr[strArr.length - j - 1]), 0);
            }
            int res = asciiCodes[i];
            for(Entry<Integer,Integer> entry:map.entrySet()){
                if(res>entry.getKey()){
                    res -= entry.getKey();
                    map.put(entry.getKey(), 1);
                }else if(res == entry.getKey()){
                    map.put(entry.getKey(), 1);
                    break;
                }
            }
            
            for(Entry<Integer,Integer> entry:map.entrySet()){
                encodeString.append(entry.getValue());
            }
            map.clear();
            String temp = encodeString.reverse().toString();
            innerMap.put(temp, (char)asciiCodes[i]);
            compressedStrings.add(temp+"1");
            encodeString.setLength(0);
            
            
        }
        for(String str1:compressedStrings){
                abc += str1;
            }

        return abc;
    }

    private static String decompress(String compressedString) {
        String[] split = compressedString.split("11");
        String result = "";
        for(String str:split){
            result += innerMap.get(str+"1");
        }
        return result;
    }
}
