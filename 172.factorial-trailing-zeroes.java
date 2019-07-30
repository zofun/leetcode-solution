/*
 * @lc app=leetcode id=172 lang=java
 *
 * [172] Factorial Trailing Zeroes
 */
class Solution {
    public int trailingZeroes(int n) {
        //这道题的笨解法是首先计算阶乘的个数，然后再计算零的个数
        //另一种解法就是计算乘数中10的个数，然后将10分解为2和5
        //而2的个数远多于5，也就是每个5都有2与其匹配形成一个10
        //所以问题分解为计算乘数中5的个数


        int result=0;
        while(n!=0){
           result+= n/5;
           n/=5;
        }


        return result;
        
    }
}

