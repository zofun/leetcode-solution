/*
 * @lc app=leetcode id=917 lang=java
 *
 * [917] Reverse Only Letters
 */
class Solution {
    public String reverseOnlyLetters(String S) {

        char[] chars=S.toCharArray();
        int left=0;
        int right=chars.length-1;
        while(left<right){
            while(right>=0&&!isLetter(chars[right])){
                right--;
            }
            while(left<chars.length&&!isLetter(chars[left])){
                left++;
            }
           if(left>right){
               break;
           }
            char tmp=chars[left];
            chars[left]=chars[right];
            chars[right]=tmp;
            right--;
            left++;
        }
        return new String(chars);
        
    }

    private boolean isLetter(char ch){
        if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')){
            return true;
        }
        return false;
    } 
}

