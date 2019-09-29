/*
 * @lc app=leetcode id=1037 lang=java
 *
 * [1037] Valid Boomerang
 *
 * https://leetcode.com/problems/valid-boomerang/description/
 *
 * algorithms
 * Easy (37.40%)
 * Likes:    50
 * Dislikes: 156
 * Total Accepted:    10.4K
 * Total Submissions: 27.8K
 * Testcase Example:  '[[1,1],[2,3],[3,2]]'
 *
 * A boomerang is a set of 3 points that are all distinct and not in a straight
 * line.
 * 
 * Given a list of three points in the plane, return whether these points are a
 * boomerang.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: [[1,1],[2,3],[3,2]]
 * Output: true
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [[1,1],[2,2],[3,3]]
 * Output: false
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * points.length == 3
 * points[i].length == 2
 * 0 <= points[i][j] <= 100
 * 
 * 
 * 
 * 
 * 
 */
class Solution {
    public boolean isBoomerang(int[][] points) {
        if((points[0][0] == points[1][0] && points[0][1] == points[1][1])
        		|| (points[0][0] == points[2][0] && points[0][1] == points[2][1])
        		|| (points[1][0] == points[2][0] && points[1][1] == points[2][1])){
        	return false;
        }
        else {
			int x = points[2][0],y = points[2][1];
			int x1 = points[0][0],y1 = points[0][1];
			int x2 = points[1][0], y2 = points[1][1];
			if((y-y1)*(x2 - x1) == (y2 - y1)*(x - x1))
				return false;
		}
        return true;
    }
}

