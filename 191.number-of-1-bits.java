/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //判断二进制串有多少1
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)==1){
                count++;
            }

            n=n>>1;
        }

        return count;
        
    }
}

