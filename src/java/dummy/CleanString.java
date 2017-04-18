/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

/**
 *
 * @author muralidhar
 */
public class CleanString {
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(clean(input));
    }

    private static String clean(String input) {
        StringBuffer buffer = new StringBuffer(input);
        if(input.length()<2) return input;
        if(buffer.charAt(0) == buffer.charAt(1)){
            buffer.deleteCharAt(0);
            return clean(buffer.toString());
        }
         return buffer.charAt(0)+clean(buffer.substring(1, buffer.length()));
    }
}
