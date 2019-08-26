/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int index;
        for(index=0;index<nums.length;index++){
            for(int i=0;i<index;i++){
                leftSum+=nums[i];
            }
            for(int j=Math.min(index+1, nums.length);j<nums.length;j++){
                rightSum+=nums[j];
            }
           
            if(leftSum==rightSum){
                return index;
            }
            leftSum=0;
            rightSum=0;
        }
        return -1;
        
    }
}

