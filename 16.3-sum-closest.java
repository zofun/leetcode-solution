import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 *
 * https://leetcode.com/problems/3sum-closest/description/
 *
 * algorithms
 * Medium (45.74%)
 * Likes:    1648
 * Dislikes: 119
 * Total Accepted:    424.7K
 * Total Submissions: 929K
 * Testcase Example:  '[-1,2,1,-4]\n1'
 *
 * Given an array nums of n integers and an integer target, find three integers
 * in nums such that the sum is closest to target. Return the sum of the three
 * integers. You may assume that each input would have exactly one solution.
 * 
 * Example:
 * 
 * 
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * 
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * 
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int left=0;
       int right=0;
       int sum=0;
       int closestSum=0;
       int minDif=Integer.MAX_VALUE;
       for(int i=0;i<nums.length-2;i++){
             left=i+1;
             right=nums.length-1;
             while(left<right){
                 sum=nums[i]+nums[left]+nums[right];
                 int dif=Math.abs(target-sum);
                 if(dif<minDif){
                    minDif=dif;
                    closestSum=sum;
                 }
                 //指针进行滑动
                 if(sum<target){
                     left++;
                 }else{
                     right--;
                 }

             }

       }
       return closestSum;
        
    }
}
// @lc code=end

