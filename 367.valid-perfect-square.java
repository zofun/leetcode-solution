/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */
class Solution {
    public boolean isPerfectSquare(int num) {

        //利用的性质是
        /**
         *  1 = 1
            4 = 1 + 3
            9 = 1 + 3 + 5
            16 = 1 + 3 + 5 + 7
            25 = 1 + 3 + 5 + 7 + 9
            36 = 1 + 3 + 5 + 7 + 9 + 11
         */
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num==0;
    
        
    }
}

