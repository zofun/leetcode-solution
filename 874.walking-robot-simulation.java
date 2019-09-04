import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode id=874 lang=java
 *
 * [874] Walking Robot Simulation
 */
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        
        int retData = 0;
        Map<Integer,List<Integer>> obstacleMap = new HashMap<>();
        for(int i=0; i<obstacles.length; i++){
            List<Integer> child = obstacleMap.get(obstacles[i][0]);
            if(child == null){
                child = new ArrayList<>();
            }
            child.add(obstacles[i][1]);
            obstacleMap.put(obstacles[i][0],child);
     
        }
        int currentX = 0;
        int currentY = 0;
        int dirX = 0;
        int dirY = 1;
        for(int i:commands){
            if(i == -1){
                if(dirX == -1){
                    dirX = 0;
                    dirY = 1;
                } else if (dirX == 1){
                    dirX = 0;
                    dirY = -1;
                } else if (dirY == -1){
                    dirX = -1;
                    dirY = 0;
                } else if (dirY == 1){
                    dirX = 1;
                    dirY = 0;
                }
     
            } else if ( i == -2) {
                if(dirX == -1){
                    dirX = 0;
                    dirY = -1;
                } else if (dirX == 1){
                    dirX = 0;
                    dirY = 1;
                } else if (dirY == -1){
                    dirX = 1;
                    dirY = 0;
                } else if (dirY == 1){
                    dirX = -1;
                    dirY = 0;
                }
            } else if(i > 0){
                while (i > 0){
                    currentX += dirX;
                    currentY += dirY;
                    if(obstacleMap.containsKey(currentX)){
                        List<Integer> child = obstacleMap.get(currentX);
                        if(child != null && child.contains(currentY)){
                            currentX -= dirX;
                            currentY -= dirY;
                            break;
                        }
                    }
                    retData = Math.max(currentX*currentX + currentY*currentY,retData);
                    i--;
                }
            }
     
        }
        retData = Math.max(currentX*currentX + currentY*currentY,retData);
        return retData;
    }


    

    


}

