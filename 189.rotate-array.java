/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */
class Solution {
    public void rotate(int[] nums, int k) {


        int temp;//用于记录最后一个数的临时变量
        for(int i=0;i<k;i++){
            //记录最后一个值
            temp=nums[nums.length-1];
            //向后移动一个空，留出第一个位置
            move(nums);
            //将最后一个数放到第一个位置
            nums[0]=temp;

        }
        
    }
    private void move(int[] nums){
        for(int n=nums.length-2;n>=0;n--){
            nums[n+1]=nums[n];
        }
    }
}

