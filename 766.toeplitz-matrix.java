/*
 * @lc app=leetcode id=766 lang=java
 *
 * [766] Toeplitz Matrix
 */
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //按顺序遍历，将遍历到的数字与它右下方的数字进行比较
        for(int row=0;row<matrix.length-1;row++){
            for(int col=0;col<matrix[0].length-1;col++){
                if(matrix[row][col]!=matrix[row+1][col+1]){
                    return false;
                }

            }
        }
        return true;
        
    }
}

