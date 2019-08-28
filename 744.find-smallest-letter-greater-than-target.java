
import java.util.HashSet;

import java.util.Set;

/*
 * @lc app=leetcode id=744 lang=java
 *
 * [744] Find Smallest Letter Greater Than Target
 */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    Set<Character> set=new HashSet<Character>();
      for(int i=0;i<letters.length;i++){
       
        set.add(letters[i]);
      }
      char temp=target;
      while(true){
          //字符是环绕的
        if((temp+1)>'z'){
            temp=(char)(temp-'z');
        }
        temp++;
        if(set.contains(temp)){
            return temp;
        }

      }
        
    }
}

