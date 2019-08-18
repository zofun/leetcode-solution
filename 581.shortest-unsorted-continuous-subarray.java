import java.util.Arrays;

/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp=Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        int len=nums.length;
        int begin=0;
        int end=len-1;
        
        for(int i=0;i<len;i++){
            
            if(nums[i]==temp[i]){
                begin++;
            }else{
                break;
            }
        }
        for(int i=len-1;i>=begin;i--){
            if(nums[i]==temp[i]){
               end--;
            }else{
                break;
            }
        }
        
        return end-begin+1;
    }
}

