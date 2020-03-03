import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 *
 * https://leetcode.com/problems/combination-sum/description/
 *
 * algorithms
 * Medium (50.81%)
 * Likes:    3046
 * Dislikes: 96
 * Total Accepted:    468.7K
 * Total Submissions: 878.2K
 * Testcase Example:  '[2,3,6,7]\n7'
 *
 * Given a set of candidate numbers (candidates) (without duplicates) and a
 * target number (target), find all unique combinations in candidates where the
 * candidate numbers sums to target.
 * 
 * The same repeated number may be chosen from candidates unlimited number of
 * times.
 * 
 * Note:
 * 
 * 
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 * ⁠ [7],
 * ⁠ [2,2,3]
 * ]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 * [2,2,2,2],
 * [2,3,3],
 * [3,5]
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(candidates);
        combinationSumHelp(candidates,result,list,target,0);
        return result;
    }
     
    public boolean combinationSumHelp(int[] candidates,List<List<Integer>> result,List<Integer> list,int target,int start){
        if(target<0){
            return false;
        }else if(target==0){
            List<Integer> temp = new ArrayList<Integer>(list);
            result.add(temp);
            return false;
        }else{
            for(int i = start; i < candidates.length ; i++){
                list.add(candidates[i]);
                boolean flag = combinationSumHelp(candidates,result,list,target-candidates[i],i);
                list.remove(list.size()-1);
                if(!flag){
                    break;
                }
            }
        }
        return true;
    }
}
// @lc code=end

