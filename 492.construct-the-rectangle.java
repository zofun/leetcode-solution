/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 */
class Solution {
    public int[] constructRectangle(int area) {

        //最好的情况就是正方形
        //如果不可以是正方形就递减宽，寻找最优解
        int[] result=new int[2];
        int r=(int)Math.sqrt(area);
        while(area%r!=0){
            r--;
        }
        result[0]=area/r;
        result[1]=r;
        return result;

        
        
    }
}

