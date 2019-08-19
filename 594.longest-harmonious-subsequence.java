import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=594 lang=java
 *
 * [594] Longest Harmonious Subsequence
 */
class Solution {
    public int findLHS(int[] nums) {
        int result=0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.containsKey(i + 1)) {
                result=Math.max(result, map.get(i)+map.get(i+1));
            }
        }

        return result;

    }
}
