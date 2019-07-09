/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */
class Solution {
    public int lengthOfLastWord(String s) {


        //这题用java写也太简单了吧 (～￣▽￣)～
        String[] strings=s.split(" ");
        if(strings.length==0){
            return 0;
        }

       

        return  strings[strings.length-1].length();
    }
}

