import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=575 lang=java
 *
 * [575] Distribute Candies
 */
class Solution {
    public int distributeCandies(int[] candies) {
        //计算糖果的种类
        Set set=new HashSet<Integer>();
        //利用set自动去重复的特性
        for(int c:candies){
            set.add(c);
        }
        int num=set.size();

        return Math.min(num, candies.length/2);

        
    }
}

