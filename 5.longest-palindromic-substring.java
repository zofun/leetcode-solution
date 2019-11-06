import java.nio.charset.MalformedInputException;

/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 *
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 *
 * algorithms
 * Medium (27.95%)
 * Likes:    4665
 * Dislikes: 417
 * Total Accepted:    702.5K
 * Total Submissions: 2.5M
 * Testcase Example:  '"babad"'
 *
 * Given a string s, find the longest palindromic substring in s. You may
 * assume that the maximum length of s is 1000.
 * 
 * Example 1:
 * 
 * 
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "cbbd"
 * Output: "bb"
 * 
 * 
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        char[] chars=s.toCharArray();
        int len=s.length();
        if(len==0){
            return "";
        }
        if(len==1){
            return s;
        }
        int[][] dp=new int[len][len];
        int maxLen=1;
        int resIndex=0;

        //初始化矩阵，键最小子问题1的情况都设置为true
        for(int i=0;i<len;i++){
            dp[i][i]=1;
            if((i<len-1)&&chars[i]==chars[i+1]){
                dp[i][i+1]=1;
                resIndex=i;
                maxLen=2;
            }
        } 

       
        //从长度为3开始逐渐增长来检查回文字符串
        for(int L=3;L<=len;L++){
            for(int i=0;i<=len-L;i++){
                if(chars[i]==chars[i+L-1]&&dp[i+1][i+L-2]==1){
                    dp[i][i+L-1]=1;
                    maxLen=L;
                    resIndex=i;
                }
            }
           
        }
        return new String(chars,resIndex,maxLen);

    }
}
// @lc code=end

