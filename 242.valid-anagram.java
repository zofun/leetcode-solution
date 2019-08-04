import java.util.HashMap;
import java.util.*;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charA=s.toCharArray();
        char[] charB=t.toCharArray();
        if(charA.length!=charB.length){
            return false;
        }

        Map<Character,Integer> mapA=new HashMap<Character,Integer>();
        Map<Character,Integer> mapB=new HashMap<Character,Integer>();
        //统计
        for(int i=0;i<charA.length;i++){
            if(mapA.containsKey(charA[i])){
                int count=mapA.get(charA[i]);
                mapA.put(charA[i], count+1);
            }else{
                mapA.put(charA[i], 1);
            }

            if(mapB.containsKey(charB[i])){
                int count=mapB.get(charB[i]);
                mapB.put(charB[i], count+1);
            }else{
                mapB.put(charB[i], 1);
            }

        }
        if(mapA.size()!=mapB.size()){
            return false;
        }

       
        for(Character ch:mapA.keySet()){
          System.out.println(ch);
            if(!mapB.containsKey(ch)){
                return false;
            }else{
                if((int)mapA.get(ch)!=(int)mapB.get(ch)){
                   
                    return false;
                }
            }
        }

        return true;

 
    }
}



