import java.util.Arrays;

/*
 * @lc app=leetcode id=532 lang=java
 *
 * [532] K-diff Pairs in an Array
 */
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int result=0;
        int cur=0;
        int pre=0;
        for(;cur<nums.length-1;cur++){
            pre=cur+1;
            while(pre<nums.length){
                if(nums[pre]-nums[cur]==k){
                   // System.out.println(nums[pre]+" "+nums[cur]);
                    result++;
                    break;
                }
                pre++;
            }
            while((cur<nums.length-1)&&(nums[cur+1]==nums[cur])){
                cur++;
            }

        }

        return result;
        
    }
}

