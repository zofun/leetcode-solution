/*
 * @lc app=leetcode id=693 lang=java
 *
 * [693] Binary Number with Alternating Bits
 */
class Solution {
    public boolean hasAlternatingBits(int n) {
        int bit = -1; // 记录上一位
        while (n > 0) {
            if ((n & 0x1) == 1) {
                if (bit == 1) {
                    return false;
                }
                bit = 1;
            } else {

                if (bit == 0) {
                    return false;
                }
                bit = 0;
            }
            n >>= 1;
        }
        return true;
    }
}
