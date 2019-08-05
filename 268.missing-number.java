/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268]e
 */
class Solution {
    public int missingNumber(int[] nums) {

        //使用位运算中的异或的方法 n^n=0
        int n=0;
        for(int i=0;i<nums.length+1;i++){
            n^=i;
        }

        for(int i=0;i<nums.length;i++){
            n^=nums[i];
        }

        return n;
        
    }
}

