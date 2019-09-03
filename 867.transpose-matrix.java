/*
 * @lc app=leetcode id=867 lang=java
 *
 * [867] Transpose Matrix
 */
class Solution {
    public int[][] transpose(int[][] A) {
        int[][] B = new int[A[0].length][A.length];
		for (int row = 0; row < A.length; ++row) {
			for (int col = 0; col < A[0].length; ++col) { 
					B[col][row] = A[row][col];
			}
		}
		
		return B;

        
    }
}

