/*
 * @lc app=leetcode id=665 lang=java
 *
 * [665] Non-decreasing Array
 */
class Solution {
    public boolean checkPossibility(int[] nums) {
        int cnt = 1, n = nums.length;
        for (int i = 1; i < n; ++i) {
            if (nums[i] < nums[i - 1]) {
                if (cnt == 0){
                    return false;
                }
                if (i == 1 || nums[i] >= nums[i - 2]){
                    nums[i - 1] = nums[i];
                }else{
                    nums[i] = nums[i - 1];
                }
                --cnt;
            } 
        }
        return true;
    }
}

