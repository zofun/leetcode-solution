import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        char[] chars=s.toCharArray();
        if(s.length()==0){
            return "";
        }
        int left=0;
        int right=chars.length-1;
        while(true){
            while(left<chars.length&&!set.contains(chars[left])){
                left++;
            }
            while(right>0&&!set.contains(chars[right])){
                right--;
            }

            if(left>=right){
                break;
            }
            swap(chars, left, right);
            left++;
            right--;
            
        }

        return new String(chars);
       
        
    }

    private void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}

