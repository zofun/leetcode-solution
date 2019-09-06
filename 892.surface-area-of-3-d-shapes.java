import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=892 lang=java
 *
 * [892] Surface Area of 3D Shapes
 */
class Solution {
    public int surfaceArea(int[][] grid) {
        int area=0;
        Set<String> set =new HashSet<String>();

        for(int x=0;x<grid.length;x++){
            for(int y=0;y<grid[0].length;y++){
                int h=grid[x][y];
                for(int i=0;i<h;i++){
                    String point=x+","+y+","+i;
                    set.add(point);
                }
            }
        }
        for(int x=0;x<grid.length;x++){
            for(int y=0;y<grid[0].length;y++){
                int h=grid[x][y];
                for(int i=0;i<h;i++){
                    //下
                    String point=x+","+y+","+(i-1);
                    if(!set.contains(point)){
                        area++;
                    }

                   //上
                   point=x+","+y+","+(i+1);
                    if(!set.contains(point)){
                        area++;
                    }
                   //前
                   point=(x+1)+","+y+","+i;
                    if(!set.contains(point)){
                        area++;
                    }

                   //后
                   point=(x-1)+","+y+","+i;
                    if(!set.contains(point)){
                        area++;
                    }

                   //左
                   point=x+","+(y+1)+","+i;
                    if(!set.contains(point)){
                        area++;
                    }

                   //右
                   point=x+","+(y-1)+","+i;
                    if(!set.contains(point)){
                        area++;
                    }
                }
            }

           
        }
        return area;



    }
}

