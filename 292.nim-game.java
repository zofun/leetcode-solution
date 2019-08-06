/*
 * @lc app=leetcode id=292 lang=java
 *
 * [292] Nim Game
 */
class Solution {
    public boolean canWinNim(int n) {
        //只要谁的面前有4颗它就一定会陷入死局，无论无何都会输
        if(n<4){
            return n==1||n==2||n==3;
        }
        return n%4!=0;
    }
}

