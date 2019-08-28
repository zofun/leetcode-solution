/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //使用动态规划
        //只有两种情况，一种就是在跨两步或者一步
        //dp[i]=min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);

        int[] dp=new int[cost.length+1];
        for(int i=2;i<cost.length+1;i++){
            dp[i]=Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        return dp[cost.length];
        
    }
}

