/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */
class Solution {
    public String reverseStr(String s, int k) {
        int len = s.length();
        char [] charArr = s.toCharArray();
        int i = 0;
        while(i < len){
            int j = Math.min(i+k-1, len-1);
            swap(charArr, i, j);
            i += 2*k;
        }
        
        return new String(charArr);
    }
    
    private void swap(char [] s, int i, int j){
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

