import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=884 lang=java
 *
 * [884] Uncommon Words from Two Sentences
 */
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> result=new LinkedList<String>();
        String[] strsA=A.split(" ");
        String[] strsB=B.split(" ");
        Map<String,Integer> mapA=new HashMap<String,Integer>();
        Map<String,Integer> mapB=new HashMap<String,Integer>();
        for(String str:strsA){
            mapA.put(str, mapA.getOrDefault(str, 0)+1);
        }
        for(String str:strsB){
            mapB.put(str, mapB.getOrDefault(str, 0)+1);
        }

        for(String key:mapA.keySet()){
            if(mapA.getOrDefault(key, 0)==1&&mapB.getOrDefault(key, 0)==0){
                result.add(key);
            }
        }
        for(String key:mapB.keySet()){
            if(mapB.getOrDefault(key, 0)==1&&mapA.getOrDefault(key, 0)==0){
                result.add(key);
            }
        }

      
        return result.toArray(new String[result.size()]);
        
    }
}

