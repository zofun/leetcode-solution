/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        char[] ch=s.toLowerCase().toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<=right){
           if(!isAlphabet(ch[left])){
               left++;
               continue;
           }

            if(!isAlphabet(ch[right])){
                right--;
                continue;
            }

            if(ch[right]!=ch[left]){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }

    /**
     * 判断是否是有效字符
     * @param ch 
     * @return
     */
    private boolean isAlphabet(char ch){
        int ascii=(int)ch;
        if(((int)'A'<=ascii&&ascii<=(int)'Z')||((int)'a'<=ascii&&ascii<=(int)'z')||((int)'0'<=ascii&&ascii<=(int)'9')){
            return true;
        }
        return false;
    }
}

