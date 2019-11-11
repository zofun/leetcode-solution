import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 *
 * https://leetcode.com/problems/3sum/description/
 *
 * algorithms
 * Medium (24.79%)
 * Likes:    4836
 * Dislikes: 578
 * Total Accepted:    693.1K
 * Total Submissions: 2.8M
 * Testcase Example:  '[-1,0,1,2,-1,-4]'
 *
 * Given an array nums of n integers, are there elements a, b, c in nums such
 * that a + b + c = 0? Find all unique triplets in the array which gives the
 * sum of zero.
 * 
 * Note:
 * 
 * The solution set must not contain duplicate triplets.
 * 
 * Example:
 * 
 * 
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is:
 * [
 * ⁠ [-1, 0, 1],
 * ⁠ [-1, -1, 2]
 * ]
 * 
 */

// @lc code=start
class Solution {
    List<List<Integer>> result=new ArrayList<List<Integer>>();
    public List<List<Integer>> threeSum(int[] nums) {
        //用于存储结果
       
        if(nums==null||nums.length<3){
            return result;
        }
        // 首先进行排序
        Arrays.sort(nums);
        //首先国定一个位置，再去寻找另外两个数
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            find(nums,i+1,nums.length-1,nums[i]);
        }

        return result;
    
    }
    private void find(int[] nums,int begin,int end,int target){
        int l=begin;
        int r=end;
        while(l<r){
            if((nums[l]+nums[r]+target)==0){
                List<Integer> list=new ArrayList<Integer>();
                list.add(target);
                list.add(nums[l]);
                list.add(nums[r]);
                result.add(list); //加入结果集
                while(l<r&&nums[l]==nums[l+1]){
                    l++;
                }
                while(l<r&&nums[r]==nums[r-1]){
                    r--;
                }
                l++;
                r--;
            }else if((nums[l]+nums[r]+target)<0){
                l++;
            }else{
                r--;
            }
        }
    }
}
// @lc code=end

