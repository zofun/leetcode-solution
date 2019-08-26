/*
 * @lc app=leetcode id=717 lang=java
 *
 * [717] 1-bit and 2-bit Characters
 */
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i;
        for(i=0;i<bits.length-1;){
            if(bits[i]==1){
                i+=2;
            }else{
                i++;
            }
        }
        return i==bits.length-1?true:false;


        
    }
}

