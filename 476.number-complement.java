/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */
class Solution {

    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) -1;
       
        num = ~num;
        return num & mask;

        
    }
}

