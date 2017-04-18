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
//This regex validates arithmetic expression containing operators [+-*/]
public class Regex {
    public static final String EXAMPLE_TEST = "3+8*9/6-2.3-8";
    public static void main(String[] args) {
        System.out.println(EXAMPLE_TEST.matches("^\\d+([\\*\\+\\-\\/\\.]\\d+)*"));
//        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
//        System.out.println(splitString.length);// should be 14
//        for (String string : splitString) {
//            System.out.println(string);
//        }

    }
}
