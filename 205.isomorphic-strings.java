import java.util.HashMap;
import java.util.Map;



/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (Integer i=0; i<s.length(); i++) {
            if (map.put(s.charAt(i), i) != map2.put(t.charAt(i), i)) {
                return false;
            }
        }
        return true;
    }



}

