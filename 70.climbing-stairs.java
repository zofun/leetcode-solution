/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */
class Solution {
    public int climbStairs(int n) {
        //这个题用递归写很简单不过会超时

        //d(0)=1
        //d(1)=1
        //d(2)=d(2-1)+d(2-2)
        //d(3)=d(3-1)+d(3-2)
        //实际就是斐波拉契数列
        //为了避免超时，不采用递归解法

        if(n<=1){
            return 1;
        }
        int result=0;
        int a=1;
        int b=1;
        for(int i=1;i<n;i++){
            result=a+b;
            b=a;
            a=result;
        }

        return result;

       
      
    }
}

