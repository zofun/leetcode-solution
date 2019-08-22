/*
 * @lc app=leetcode id=661 lang=java
 *
 * [661] Image Smoother
 */
class Solution {
    public int[][] imageSmoother(int[][] M) {

        int row=M.length;
        int col=M[0].length;
        int[][] result=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                //计算（i,j）位置周围3*3的值总和
                int sum=0;
                int count=0;
                //边界处理
                for(int x=Math.max(0, i-1);x<=Math.min(row-1,i+1);x++){
                    for(int y=Math.max(0, j-1);y<=Math.min(col-1, j+1);y++){
                        sum+=M[x][y];
                        count++;
                    }
                }
                
                result[i][j]=sum/count;
            }
        }
        return result;

        
    }
}

