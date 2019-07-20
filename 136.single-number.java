/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */
class Solution {
    public int singleNumber(int[] nums) {
        //要求在原地工作，线性时间复杂度
        //采用位运算的思想，数组中的数字要么出现一次要么出现两次
        //采用异或 1010^1010=0000 也就是说只要出现两次的数，经过异或处理后
        //都会变为0
        
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
        
    }
}

