import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */
class Solution {
    public int firstUniqChar(String s) {

        char[] ch=s.toCharArray();
        char[] count=new char[26];
        for(char c:ch){
            count[c-'a']++;
        }

        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(count[c-'a']==1){
                return i;
            }
        }
        return -1;
    }
}

