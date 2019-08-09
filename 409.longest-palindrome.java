import java.util.HashMap;
import java.util.Map;
import java.util.*;

/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */
class Solution {
    public int longestPalindrome(String s) {

        int[] arr = new int[256];
        //统计
        for (int i=0; i<s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int count = 0;
        int single = 0;
        for (int j=0; j<arr.length; j++) {
            if (arr[j]%2 == 0) {
                //出现偶数次的字符
                count += arr[j];
            } else {
                //出现奇数次，如果只出现一次，则只能放到中间
                //如果大于一次则偶数次部分随意使用
                count += arr[j]-1; //偶数次部分
                single = 1; 
            }
        }
        return count+single;
        
    }
}

