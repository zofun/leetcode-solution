import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=888 lang=java
 *
 * [888] Fair Candy Swap
 */
class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        //sA-x+y = sB-y+x => 2x = sA+2y-sB
        int sA = 0, sB = 0;
        Set<Integer> setA = new HashSet<>();
        for(int x : a){
            setA.add(x);
            sA += x;
        }
        for(int y : b){
            sB += y;
        }
        for(int y : b){
            int x = (sA+2*y-sB) / 2;
            if(setA.contains(x)){
                return new int[]{x, y};
            }
        }
        //never reaches
        return new int[2];
    }
}

