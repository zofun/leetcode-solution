/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 *
 * https://leetcode.com/problems/unique-paths/description/
 *
 * algorithms
 * Medium (49.25%)
 * Likes:    2436
 * Dislikes: 175
 * Total Accepted:    396.6K
 * Total Submissions: 772.5K
 * Testcase Example:  '3\n2'
 *
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * 
 * Above is a 7 x 3 grid. How many possible unique paths are there?
 * 
 * Note: m and n will be at most 100.
 * 
 * Example 1:
 * 
 * 
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the
 * bottom-right corner:
 * 1. Right -> Right -> Down
 * 2. Right -> Down -> Right
 * 3. Down -> Right -> Right
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: m = 7, n = 3
 * Output: 28
 * 
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0 || n==0) return 0;  
        if(m ==1 || n==1) return 1;  
         
       int[][] dp = new int[m][n];  
         
       //只有一行时，到终点每个格子只有一种走法  
       for (int i=0; i<n; i++)  
           dp[0][i] = 1;  
         
       // 只有一列时，到终点每个格子只有一种走法
       for (int i=0; i<m; i++)  
           dp[i][0] = 1;  
         
       // for each body node, number of path = paths from top + paths from left  
       for (int i=1; i<m; i++){  
           for (int j=1; j<n; j++){  
               dp[i][j] = dp[i-1][j] + dp[i][j-1];  
           }  
       }  
       return dp[m-1][n-1];  
    }
}
// @lc code=end

