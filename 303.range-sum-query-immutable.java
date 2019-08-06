/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */
class NumArray {


    int[] dp;
    public NumArray(int[] nums) {
        dp=new int[nums.length];
        dp=nums;
        //类似直方图的原理
        for(int i=1;i<nums.length;i++){
            dp[i]+=dp[i-1];
        }
    }
    
    public int sumRange(int i, int j) {
        if(i==0){
            return dp[j];
        }

        return dp[j]-dp[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

