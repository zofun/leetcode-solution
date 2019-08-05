import java.util.HashMap;
import java.util.*;

/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] chars=pattern.toCharArray();
        String[] strs=str.split(" ");

        Map<Character,Integer> mapA=new HashMap<Character,Integer>();
        Map<String,Integer> mapB=new HashMap<String,Integer>(); 
        if(chars.length!=strs.length){
            
            return false;
        }
        for(int i=0;i<chars.length;i++){
            if(mapA.containsKey(chars[i])!=mapB.containsKey(strs[i])){
                
                return false;
            }else if(!mapA.containsKey(chars[i])){
                //都没有
                mapA.put(chars[i], i);
                mapB.put(strs[i], i);
            }else{
                //都有
            
                if((int)mapA.get(chars[i])!=(int)mapB.get(strs[i])){
                    return false;
                }
                mapA.put(chars[i], i);
                mapB.put(strs[i], i);

            }
        }

        return true;
        
    }
}

