/*
 * @lc app=leetcode id=696 lang=java
 *
 * [696] Count Binary Substrings
 */
class Solution {
    public int countBinarySubstrings(String s) {
        char[] chars=s.toCharArray();

        int res = 0, pre = 0, cur = 1;
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i - 1]){
                ++cur;
            }else {
                pre = cur;
                cur = 1;
            }
            if (pre >= cur){
                ++res;
            }
        }
        return res;
    }
}

