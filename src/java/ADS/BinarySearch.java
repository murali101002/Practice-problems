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
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,23,45,67,78,89,90};
        int x = 89;
        BinSearch bs = new BinSearch();
        System.out.println("Binary Search of "+arr+" is: "+bs.binarySearch(arr, x));
    }
    static class BinSearch{
        public int binarySearch(int[] nums, int x){
            int l = 0, r = nums.length-1, mid = 0;
            while(l<r){
                System.out.println("In while loop");
                mid = l+(r-l)/2;
                if(nums[mid] == x) return mid;
                else if(x > nums[mid]){
                    l = mid+1;
                }else if(x < nums[mid]){
                    r = mid;
                }
            }
            
            return 0;
        }
    }
    
}
