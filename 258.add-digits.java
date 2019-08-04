/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */
class Solution {
    public int addDigits(int num) {
        //首先想到的是利用循环拆分进行判断类似202happy Number的解fa
        //查询资料后发现了这种更简单的解法
        return ((num-1)%9)+1;
    }
}

