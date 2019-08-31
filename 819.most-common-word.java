import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;



/*
 * @lc app=leetcode id=819 lang=java
 *
 * [819] Most Common Word
 */
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set=new HashSet<String>();
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String str:banned){
            set.add(str);
        }
        String[] words=splitWords(paragraph);
        for(String w:words){
            w=w.toLowerCase();
           
            if(!set.contains(w)){
                map.put(w, map.getOrDefault(w, 0)+1);
            }
        }
        int max=0;
        String result="";
        for(String key:map.keySet()){
           if(key.equals("")){
               continue;
           }
            int count=map.get(key);
          
            if(count>=max){
                max=count;
                result=key;
            }
        }
        return result;

        
    }
    private String[] splitWords(String str){
        char[] chars=str.toCharArray();
        List<String> list=new LinkedList<String>();
        int left=0;
        int right=0;
       while(left<chars.length&&right<chars.length){
            while(left<chars.length&&!isAlphabet(chars[left])){
                left++;
            }
            right=left;
            while(right<chars.length&&isAlphabet(chars[right])){
                right++;
            }
            list.add(new String(chars,left,right-left));
            left=right;
        }

        return list.toArray(new String[list.size()]);
    }

    /**
     * 判断是否时字母
     */
    private boolean isAlphabet(char ch){
        if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')){
            return true;
        }
        return false;

    }
}

