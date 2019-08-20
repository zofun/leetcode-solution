/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */
class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=(int)Math.sqrt(c);i>=0;i--){
            if(i*i==c){
                return true;
            }
            int d=c-i*i;
            int t=(int)Math.sqrt(d); //判断是否能被完全开方
            if(t*t==d){
                return true;
            }
        }

        return false;
        
    }
}

