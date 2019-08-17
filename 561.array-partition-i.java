import java.util.Arrays;

/*
 * @lc app=leetcode id=561 lang=java
 *
 * [561] Array Partition I
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);
        int res = 0;
        for(int i=0; i<nums.length/2; i++){
            res += Math.min(nums[2*i], nums[2*i+1]);
        }
        return res;

    }
}

