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
public class JumpSearch {
    public static void main(String[] args) {
        jSearch js = new jSearch();
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int num = 610;
        System.out.println("Result="+js.jumpSearch(arr, num));
    }
    static class jSearch{
        public int jumpSearch(int[] nums, int x){
            int step = (int)Math.sqrt(Math.floor(nums.length));
            int prev = 0;
            while(step<=nums.length-1){
                if(x == nums[step]) return step;
                else if(x<nums[step]) return linearSearch(prev,nums,step,x);
                prev = step;
                step += (int)Math.sqrt(Math.floor(nums.length));
            }
            return linearSearch(prev,nums,step,x);
        }

        private int linearSearch(int prev, int[] nums, int step, int x) {
            if(step>=nums.length) step = nums.length-1;
            for(int i=prev;i<=step;i++){
                if(nums[i] == x) return i;
            }
            return 0;
        }
    }
}
