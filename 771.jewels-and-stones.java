import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */
class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        char[] type=J.toCharArray();
        char[] stones=S.toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(char stone:stones){
            //统计所有的宝石
            map.put(stone, map.getOrDefault(stone,0)+1);
        }
        for(char t:type){
            count+=map.getOrDefault(t, 0);
        }
        return count;
        
    }
}

