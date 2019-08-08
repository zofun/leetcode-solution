/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */
class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] charS=s.toCharArray();
        char[] charT=t.toCharArray();
        char result=0;
        for(char ch:charS){
            result^=ch;
        }

        for(char ch:charT){
            result^=ch;
        }

        return result;

    }
}

