/*
 * @lc app=leetcode id=371 lang=java
 *
 * [371] Sum of Two Integers
 */
class Solution {
    public int getSum(int a, int b) {
        if (b == 0){
            return a;
        } 
        int sum = a ^ b;
        int carry = (a & b & 0x7fffffff) << 1;
        return getSum(sum, carry);
    }
}

