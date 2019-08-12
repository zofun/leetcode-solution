/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 */
class Solution {
    public int minMoves(int[] nums) {
        //每次可以给n-1个数加一，也就是说每次给除了最大的那个数加一，
        //直到相等，但是这个方法会超时
        //我们将问题转换为每次给最大的那个数减1，直到所有的数和最开始的那个
        //最小的数相等。所需要移动的次数，就是最小的那个数与所有数的差值

        int min=nums[0];
        int sum=0;
        for(int num:nums){
            sum+=num;
            if(min>num){
                min=num;
            }
        }

        return sum-min*nums.length;
        
    }
}

