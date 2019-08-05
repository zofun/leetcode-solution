/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */
class Solution {
    public void moveZeroes(int[] nums) {

        //首先将所有非零的数字复制到前面
        //同时记录非零数字的个数，将剩下的位置全部赋值为零
        int k = 0; 
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i]!=0){
                nums[k++] = nums[i];
            }
        }    
 
        // 将nums剩余的位置放置为0
        for(int i = k ; i < nums.length ; i ++){
            nums[i] = 0;
        }
           

    }
}

