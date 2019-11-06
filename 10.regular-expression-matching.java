/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 *
 * https://leetcode.com/problems/regular-expression-matching/description/
 *
 * algorithms
 * Hard (25.70%)
 * Likes:    3233
 * Dislikes: 600
 * Total Accepted:    356.5K
 * Total Submissions: 1.4M
 * Testcase Example:  '"aa"\n"a"'
 *
 * Given an input string (s) and a pattern (p), implement regular expression
 * matching with support for '.' and '*'.
 * 
 * 
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * 
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * Note:
 * 
 * 
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters
 * like . or *.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input:
 * s = "aa"
 * p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input:
 * s = "aa"
 * p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'.
 * Therefore, by repeating 'a' once, it becomes "aa".
 * 
 * 
 * Example 3:
 * 
 * 
 * Input:
 * s = "ab"
 * p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 * 
 * 
 * Example 4:
 * 
 * 
 * Input:
 * s = "aab"
 * p = "c*a*b"
 * Output: true
 * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore,
 * it matches "aab".
 * 
 * 
 * Example 5:
 * 
 * 
 * Input:
 * s = "mississippi"
 * p = "mis*is*p*."
 * Output: false
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        int lenA=s.length();
        int lenP=p.length();
        char[] charsS=s.toCharArray();
        char[] charsP=p.toCharArray();

        boolean[][] b=new boolean[lenA+1][lenP+1];
        b[0][0]=true;
        for(int i=0;i<lenA;i++){
            b[i+1][0]=false;
        }
        for(int j=0;j<lenP;j++){
            b[0][j+1]=j>0&&charsP[j]=='*'&&b[0][j-1];
        }
        for(int i=0;i<lenA;i++){
            for(int j=0;j<lenP;j++){
                if(charsP[j]!='*'){
                    b[i+1][j+1]=b[i][j]&&('.'==charsP[j]||charsS[i]==charsP[j]);
                }else{
                    b[i+1][j+1]=b[i + 1][j - 1] && j > 0 || b[i + 1][j] ||
                    b[i][j + 1] && j > 0 && ('.' == charsP[j - 1] || charsS[i] == charsP[j - 1]);
                }
            }
        }
        return b[lenA][lenP];
    }
}
// @lc code=end

