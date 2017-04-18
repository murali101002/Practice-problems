/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

/**
 *
 * @author muralidhar
 */
public class HR_AlgorithmicCrush {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s");
        int n = Integer.parseInt(input[0]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        int m = Integer.parseInt(input[1]);
        while (m-- > 0) {
            String inputLine = scan.nextLine();
            arr = crushAlgorithm(inputLine, arr);
        }
//        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
//        System.out.println(stat.getMax());
//        System.out.println(Arrays.stream(arr).max().getAsInt());
        int sum = 0,max = arr[0];
        for(int k:arr){
            sum = sum+k;
            if(sum>max) max = sum;
        }
        System.out.println(max);
    }

    private static int[] crushAlgorithm(String inputLine, int[] arr) {
        String[] sliceInput = inputLine.split("\\s");
        int start = Integer.parseInt(sliceInput[0]);
        int end = Integer.parseInt(sliceInput[1]);
        int range = Integer.parseInt(sliceInput[2]);
//        for (int i = start - 1; i <= end - 1; i++) {
//            arr[i] = arr[i] + range;
//        }
        arr[start-1] += range;
        arr[end-1] -= range;
        return arr;
    }
}
