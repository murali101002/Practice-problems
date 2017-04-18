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
public class AlphabetSequence {
    public static void main(String[] args) {
        String input = "zz";
        calculateSequenceValue(input);
    }

    private static void calculateSequenceValue(String input) {
        char[] chArr = input.toUpperCase().toCharArray();
        if(chArr.length == 2) System.out.println(((chArr[0]-64)*26)+chArr[1]-64);
        else System.out.println(chArr[0]-64);
    }
    
}
