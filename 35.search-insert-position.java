/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //简简单单ε=ε=ε=(~￣▽￣)~
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return nums.length;
        
    }
}

