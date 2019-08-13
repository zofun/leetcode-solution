import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 */
class Solution {
    public int islandPerimeter(int[][] grid) {
        Set set=new HashSet<String>();

        int result=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    set.add(i+","+j);
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    continue;
                }
                //当前坐标i,j
                //上 i-1,j
                //下i+1,j
                //左i，j-1
                //右i，j+1
               if(!set.contains((i-1)+","+j)){
                    result++;
               }
               if(!set.contains((i+1)+","+j)){
               
                    result++;
               }
               if(!set.contains(i+","+(j-1))){
               
                    result++;
                }
                if(!set.contains(i+","+(j+1))){
                    
                    result++;
                }

            }
        }

        return result;



        
    }
}

