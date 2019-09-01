import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=840 lang=java
 *
 * [840] Magic Squares In Grid
 */
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[0].length-2;j++){
                int[] point={i,j};
                if(isMagicSquare(grid,point)){
                    count++;
                }
            }
        }
        return count;
        
    }

    /**
     * 判断从point作为顶点的3*3矩阵是否满足条件
     * @param grid
     * @param point
     * @return
     */
    private boolean isMagicSquare(int[][] grid,int[] point){
        Set<Integer> set=new HashSet<Integer>();
        int x=point[0];
        int y=point[1];
        //先前的和
        int preSum=-1;
        //按行判断
        for(int row=x;row<x+3;row++){
            int sum=0;
            for(int col=y;col<y+3;col++){
                if(set.contains(grid[row][col])||grid[row][col]>=10||grid[row][col]<=0){
                    return false;
                }
                sum+=grid[row][col];
                set.add(grid[row][col]);
            }
            if(preSum==-1){
                preSum=sum;
            }else{
                if(sum!=preSum){
                    return false;
                }
            }
        }

        //按列判断
        for(int col=y;col<y+3;col++){
            int sum=0;
            for(int row=x;row<x+3;row++){
                sum+=grid[row][col];
            } 
            if(sum!=preSum){
                return false;
            }
        }

        //按对角线判断
        int sum=0;
        int i=x;
        int j=y;
        for(int count=0;count<3;count++){
            sum+=grid[i][j];
            i++;
            j++;
        }
        if(sum!=preSum){
            return false;
        }

        sum=0;
        i=x+2;
        j=y+2;
        for(int count=0;count<3;count++){
            sum+=grid[i][j];
            i--;
            j--;
        }
        if(sum!=preSum){
            return false;
        }

        return true;


    }
}

