/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */
class Solution {
    public int dominantIndex(int[] nums) {
        //基本思路是，找出最大的数和第二大的数，
        //如果第二大的数都不及最大的数的一般，那么那些更小的数
        //也满足条件

        if(nums.length==0){
            return -1;
        }
        int index=0; //记录最大的数的下标
        long max=Long.MIN_VALUE; //最大的数
        long second=Long.MIN_VALUE; //第二大的数
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                second=max;
                max=nums[i];
                index=i;
            }else if(nums[i]>second){
                second=nums[i];
            }
        }
        if(second*2<=max){
            return index;
        }else{
            return -1;
        }


    }
}

