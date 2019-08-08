import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //题目描述倒是挺花里胡哨的，简单来讲就是要判断从magazine中取字母能否
        //组成ransomNote
        char[] r=ransomNote.toCharArray();
        char[] m=magazine.toCharArray();
        if(r.length>m.length){
            return false;
        }

        Map<Character,Integer> mapA=new HashMap<Character,Integer>();
        //统计magazine
        for(char ch:m){
            if(mapA.containsKey(ch)){
                mapA.put(ch, mapA.get(ch)+1);
            }else{
                mapA.put(ch, 1);
            }
        }

        for(char ch:r){
            if(mapA.containsKey(ch)){
                int count=mapA.get(ch);
                if(count==1){
                    mapA.remove(ch);
                }else{
                    mapA.put(ch, count-1);
                }
            }else{
                return false;
            }
        }

        return true;
        
    }
}

