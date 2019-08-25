/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */
class Solution {
    public String toLowerCase(String str) {
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            if('A'<=ch&&ch<='Z'){
                chars[i]=(char)(ch-'A'+'a');
            }
        }
        return new String(chars);
    }
}

