/*
 * @lc app=leetcode id=686 lang=java
 *
 * [686] Repeated String Match
 */
class Solution {
    public int repeatedStringMatch(String A, String B) {

        int lenB = B.length();
        String str = A;
        int count = 0;
        while (str.length() < lenB) {
            str += A;
            count++;
        }
        int index = str.indexOf(B);
        if (index != -1) {
            return count+1;
        }
        str += A;
        count++;
        index = str.indexOf(B);
       
        if (index == -1) {
            return -1;
        } else {
            return count+1;
        }

    }
}
