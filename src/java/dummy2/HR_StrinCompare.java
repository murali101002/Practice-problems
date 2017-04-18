/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy2;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author muralidhar
 */
public class HR_StrinCompare {
    public static void main(String[] args) {
        Queue<Character> q = new ArrayDeque<>();
//        for(int i=0;i<10;i++) System.out.println(i+" = "+q.getClass().getInterfaces()[i].getName());
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String input = scan.nextLine();
        int len = scan.nextInt();
        for(int i=0;i<=input.length()-len;i++){
            list.add(input.substring(i, i+len));
            System.out.println(input.substring(i, i+len));
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}
