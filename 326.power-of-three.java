/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }

        //1162261467就是int型中最大的满足要求的数
        if(1162261467%n==0){
            return true;
        }else{
            return false;
        }
        
    }
}

