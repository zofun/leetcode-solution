import java.util.Arrays;

/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */
class Solution {
    public int thirdMax(int[] nums) {
        long max,second,third;

        max=second=third=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                third=second;
                second=max;
                max=nums[i];
            }else if(nums[i]>second &&nums[i]<max){
                third=second;
                second=nums[i];
            }else if(nums[i]>third &&nums[i]<second){
                third=nums[i];
            }
        }

        return (third==Long.MIN_VALUE||third==second)? (int)max:(int)third;
        
    }
}

