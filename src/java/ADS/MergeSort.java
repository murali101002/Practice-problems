/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADS;

/**
 *
 * @author muralidhar
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
    }
    static class Merge{
        void sort(int[] arr, int l, int r){
            if(l<r){
                int m = (r-l)/2;
                sort(arr,l,m);
                sort(arr,m+1,r);
            }
        }
    }
}
