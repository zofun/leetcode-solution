import java.util.Arrays;
import java.util.TreeSet;

/*
 * @lc app=leetcode id=1030 lang=java
 *
 * [1030] Matrix Cells in Distance Order
 *
 * https://leetcode.com/problems/matrix-cells-in-distance-order/description/
 *
 * algorithms
 * Easy (64.38%)
 * Likes:    103
 * Dislikes: 61
 * Total Accepted:    14K
 * Total Submissions: 21.7K
 * Testcase Example:  '1\n2\n0\n0'
 *
 * We are given a matrix with R rows and C columns has cells with integer
 * coordinates (r, c), where 0 <= r < R and 0 <= c < C.
 * 
 * Additionally, we are given a cell in that matrix with coordinates (r0, c0).
 * 
 * Return the coordinates of all cells in the matrix, sorted by their distance
 * from (r0, c0) from smallest distance to largest distance.  Here, the
 * distance between two cells (r1, c1) and (r2, c2) is the Manhattan distance,
 * |r1 - r2| + |c1 - c2|.  (You may return the answer in any order that
 * satisfies this condition.)
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: R = 1, C = 2, r0 = 0, c0 = 0
 * Output: [[0,0],[0,1]]
 * Explanation: The distances from (r0, c0) to other cells are: [0,1]
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: R = 2, C = 2, r0 = 0, c0 = 1
 * Output: [[0,1],[0,0],[1,1],[1,0]]
 * Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2]
 * The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: R = 2, C = 3, r0 = 1, c0 = 2
 * Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
 * Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2,2,3]
 * There are other answers that would also be accepted as correct, such as
 * [[1,2],[1,1],[0,2],[1,0],[0,1],[0,0]].
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 1 <= R <= 100
 * 1 <= C <= 100
 * 0 <= r0 < R
 * 0 <= c0 < C
 * 
 * 
 * 
 * 
 * 
 */
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[] l = new int[4];
        l[0] = r0 + c0;
        l[1] = r0 + C - 1 - c0;
        l[2] = R - 1 - r0 + c0;
        l[3] = R - 1 - r0 + C - 1 - c0;
        int m = 0;
        for(int i : l) {
            if(i > m) {
                m = i;
            }
        }
        
        int[][] ref= new int[R * C][2];
        int idx = 1;
        ref[0][0] = r0;
        ref[0][1] = c0;
        for(int i = 1; i <= m; i++) {
            for(int x = 0; x <= i; x++) {
                if(r0 - x >= 0 && c0 - (i - x) >= 0) {
                    ref[idx][0] = r0 - x;
                    ref[idx++][1] = c0 - (i - x);
                }
                if(r0 + x <= R - 1 && c0 - (i - x) >= 0 && x != 0 && i != x) {
                    ref[idx][0] = r0 + x;
                    ref[idx++][1] = c0 - (i - x);              
    
                }
                if(r0 - x >= 0 && c0 + (i - x) <= C - 1  && x != 0 && i != x) {
                    ref[idx][0] = r0 - x;
                    ref[idx++][1] = c0 + (i - x);              
    
                }
                if(r0 + x <= R - 1 && c0 + (i - x) <= C - 1) {
                    ref[idx][0] = r0 + x;
                    ref[idx++][1] = c0 + (i - x);         
    
                }
            }    
        }
        return ref;
    
    }
}

