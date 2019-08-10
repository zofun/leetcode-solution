

/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */
class Solution {
    public String addStrings(String num1, String num2) {
        int len = num1.length()-1;
        int len2 = num2.length()-1;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=len, j=len2; i>=0 || j>=0 || count == 1; i--,j--) {
            int n = i >= 0 ? num1.charAt(i)-'0' : 0;
            int n2 = j >= 0 ? num2.charAt(j)-'0' : 0;
            int sum = n + n2 + count;
            sb.insert(0, sum%10);
            count = sum/10;
        }
        return sb.toString();

        
    }
}

