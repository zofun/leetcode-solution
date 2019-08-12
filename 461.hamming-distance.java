/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 */
class Solution {
    public int hammingDistance(int x, int y) {

        int count=0;
        for(int i=0;i<32;i++){
            if((x&0x1)!=(y&0x1)){
                count++;
            }
            x=x>>1;
            y=y>>1;
        }
        return count;
        
    }
}

