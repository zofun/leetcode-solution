
import java.util.Collections;
import java.util.HashMap;

/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
    
        HashMap<Integer,Integer> r = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> l = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> c = new HashMap<Integer,Integer>();
        int len = nums.length;
        for(int i=0;i<len;i++){
            int x = nums[i];
            if(l.get(x)==null){
                l.put(x,i);
            }
            r.put(x,i);
            c.put(x,c.getOrDefault(x,0)+1);
        }
        int ans = nums.length;
        int degree = Collections.max(c.values());
        for (int x: c.keySet()) {
            if (c.get(x) == degree) {
                ans = Math.min(ans, r.get(x) - l.get(x) + 1);
            }
        }
        return ans;

    }
}

