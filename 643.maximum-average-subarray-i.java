/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //利用累加数组
        int[] sums=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            sums[i]=sum;
          
        }
        double max=(double)sums[k-1];

        for(int i=k;i<sums.length;i++){
            max=Math.max(max, (double)sums[i]-(double)sums[i-k]);
        }
        return max/k;
       
    }
}

