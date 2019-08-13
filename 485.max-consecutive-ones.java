/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                while(i<nums.length&&nums[i]==1){
                    n++;
                    i++;
                }
                if(n>maxLen){
                    maxLen=n;
                }
                n=0;
                
            }
        }
        return maxLen;
        
    }
}

