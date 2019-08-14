/*
 * @lc app=leetcode id=504 lang=java
 *
 * [504] Base 7
 */
class Solution {
    public String convertToBase7(int num) {
        if (num < 0){
            //处理负数
            return "-" + convertToBase7(-num);
        }
        if (num < 7){
            return String.valueOf(num);
        }
        return convertToBase7(num / 7) + String.valueOf(num% 7);
    }
}

