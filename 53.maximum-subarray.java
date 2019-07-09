/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */
class Solution {
    public int maxSubArray(int[] nums) {

        //求最大和的连续子数组
        //设dp[i]为以dp[i]结尾的子数组的最大和
        //dp[i]=max(dp[i],dp[i-1]+nums)


        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i], dp[i-1]+nums[i]);
        }

        //计算全局最优解

        int result=dp[0];
        for(int i=0;i<dp.length;i++){
            if(result<dp[i]){
                result=dp[i];
            }
        }

        return result;

        
  
    }
}

