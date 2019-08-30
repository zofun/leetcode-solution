import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=804 lang=java
 *
 * [804] Unique Morse Code Words
 */
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<String>();
        for(String str:words){
            char[] chars=str.toCharArray();
            String MourseCode="";
            for(char ch:chars){
                MourseCode+=code[ch-'a'];
            }
            set.add(MourseCode);
        }
        return set.size();
        
        
    }
}

