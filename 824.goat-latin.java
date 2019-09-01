import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=824 lang=java
 *
 * [824] Goat Latin
 */
class Solution {
    public String toGoatLatin(String S) {
        char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> set=new HashSet<Character>();
        for(char ch:vowel){
            set.add(ch);
        }
        String[] strings=S.split(" ");
        String result="";

       
        for(int i=0;i<strings.length;i++){
            String str=strings[i];
            
            char[] tmp=str.toCharArray();
            char first=tmp[0];
            StringBuffer sb=new StringBuffer();
            if(set.contains(first)){
                sb.append(str);
                sb.append("ma");
            }else{
                sb.append(str.substring(1, tmp.length)+first+"ma");
            }
            for(int j=0;j<i+1;j++){
                sb.append("a");
            }
            result+=sb.toString();
            if(i!=strings.length-1){
                result+=" ";
            }
        }
        return result;
        
    }

}

