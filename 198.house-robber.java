

/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */
class Solution {
    public int rob(int[] nums) {
        //这道题可以使用动态规划的解法
        //有题可知，为了实现利益最大化，可以跳过一间或两间
        //对于第i间要么不偷，要么偷
        //所以状态转移方程为
        //dp[i] = max(dp[i-2]+nums[i],dp[i-1])。

        int[] dp=new int[nums.length];
        int len=nums.length;
       
        if(nums.length==0){
            return 0;
        }
        dp[0]=nums[0];
        if(nums.length==1){
            return dp[0];
        }
        dp[1]=Math.max(nums[0], nums[1]);
    

        for(int i=2;i<len;i++){
           
            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[len-1];
    }
        
       
}

