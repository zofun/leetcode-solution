/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */
class Solution {
    public int mySqrt(int x) {
        //防止溢出
        long i=1;
        while(i*i<=x){
            i++;
        }

        if(i*i==x){
            return (int)i;
        }else{
            return (int)i-1;
        }
        
    }
}

