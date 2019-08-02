import java.util.HashMap;
import java.util.*;

/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

       Map<Integer,Integer> map=new HashMap<Integer,Integer>();
       
       int index=0;
        for(int i=0;i<nums.length;i++){
            if(i>k){
                map.remove(nums[index]);
               index++;
            }
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
        
    
}

