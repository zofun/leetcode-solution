import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
        
    }
}

