/*
 * @lc app=leetcode id=883 lang=java
 *
 * [883] Projection Area of 3D Shapes
 */
class Solution {
    public int projectionArea(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        //v = grid[x][y]
        int button=0;
        //每一列最高的 之和
        int sumA=0;
        for(int x=0;x<grid.length;x++){
            int max=0;
            for(int y=0;y<grid[0].length;y++){
                if(grid[x][y]!=0){
                    button++;
                }
                if(grid[x][y]>max){
                    max=grid[x][y];
                }
            }
            sumA+=max;
        }

        //每一行最高的 之和
        int sumB=0;
        for(int y=0;y<grid[0].length;y++){
            int max=0;
            for(int x=0;x<grid.length;x++){
                if(grid[x][y]>max){
                    max=grid[x][y];
                }
            }
            sumB+=max;
        }

        return button+sumA+sumB;
    }
}

