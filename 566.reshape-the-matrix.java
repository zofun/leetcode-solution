/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row=nums.length;
        int col=nums[0].length;
        if(r*c!=row*col){
            return nums;
        }
        int[][] matrix=new int[r][c];
        int a=0,b=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[a][b]=nums[i][j];
                b++;
                if(b==c){
                    a++;
                    b=0;
                }
               
            }
        }

        return matrix;
        
    }
}

