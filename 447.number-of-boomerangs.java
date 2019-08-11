import java.util.*;
/*
 * @lc app=leetcode id=447 lang=java
 *
 * [447] Number of Boomerangs
 */
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        int dis = 0;
        int freq = 0;
        int tempRes = 0;
        HashMap<Integer, Integer> hashDis = new HashMap<Integer, Integer>();
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points.length; j++){
                dis = (points[j][0] - points[i][0]) * (points[j][0] - points[i][0])
                    + (points[j][1] - points[i][1]) * (points[j][1] - points[i][1]);
                if(dis != 0){
                    if(hashDis.containsKey(dis)){
                        freq = hashDis.get(dis);
                        hashDis.put(dis, freq + 1);
                        tempRes += freq;
                    }else{
                        hashDis.put(dis, 1);
                    }
                }
            }
            result += tempRes * 2;
            tempRes = 0;
            hashDis.clear();
        }
        return result;
    }
}

