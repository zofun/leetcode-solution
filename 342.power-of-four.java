/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */
class Solution {
    public boolean isPowerOfFour(int num) {
        //num>0首先确保是正数
        //num&(num-1)==0确保是2的次方
        //(num&0x55555555)==num
        //101 0101 0101 0101 0101 0101 0101 0101==0x55555555
        return (num>0) && (num&(num-1))==0 &&(num&0x55555555)==num;
    }
}

