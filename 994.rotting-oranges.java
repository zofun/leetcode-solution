import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import javax.management.Query;

/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 *
 * https://leetcode.com/problems/rotting-oranges/description/
 *
 * algorithms
 * Easy (46.20%)
 * Likes:    374
 * Dislikes: 29
 * Total Accepted:    19.1K
 * Total Submissions: 41.3K
 * Testcase Example:  '[[2,1,1],[1,1,0],[0,1,1]]'
 *
 * In a given grid, each cell can have one of three values:
 * 
 * 
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * 
 * 
 * Every minute, any fresh orange that is adjacent (4-directionally) to a
 * rotten orange becomes rotten.
 * 
 * Return the minimum number of minutes that must elapse until no cell has a
 * fresh orange.  If this is impossible, return -1 instead.
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * 
 * Input: [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation:  The orange in the bottom left corner (row 2, column 0) is
 * never rotten, because rotting only happens 4-directionally.
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: [[0,2]]
 * Output: 0
 * Explanation:  Since there are already no fresh oranges at minute 0, the
 * answer is just 0.
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] is only 0, 1, or 2.
 * 
 * 
 * 
 * 
 */
class Solution {
    public static class Orange {
        public int row;
        public int col;
        public int level;
        
        public Orange(int row, int col, int level) {
            this.row = row;
            this.col = col;
            this.level = level;
        }
    }
    
    
    private Queue<Orange> queue = new LinkedList<>();
    
    private int count = 0;
    
    private int total = 0;
    
    private int level = 0;
    public int orangesRotting(int[][] grid) {
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                if (grid[i][j] == 2) {
                    queue.offer(new Orange(i, j, 0));
                }
                if (grid[i][j] != 0) {
                    total++;
                }
            }
        }
        
        while (!queue.isEmpty()) {
            Orange o = queue.poll();
            
            int row = o.row;
            int col = o.col;
                        
            level = o.level;
            count++;
            
            if (row > 0 && grid[row - 1][col] == 1) {
                grid[row - 1][col] = 2;
                queue.offer(new Orange(row - 1, col, level + 1));
            }
            
            if (row < grid.length - 1 && grid[row + 1][col] == 1) {
                grid[row + 1][col] = 2;
                queue.offer(new Orange(row + 1, col, level + 1));
            }
            
            if (col > 0 && grid[row][col - 1] == 1) {
                grid[row][col - 1] = 2;
                queue.offer(new Orange(row, col - 1, level + 1));
            }
            
            if (col < grid[0].length - 1 && grid[row][col + 1] == 1) {
                grid[row][col + 1] = 2;
                queue.offer(new Orange(row, col + 1, level + 1));
            }
        }
        
        if (count < total) {
            return -1;
        }
        
        return level;
    
    }
}

