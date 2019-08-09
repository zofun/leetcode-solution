/*
 * @lc app=leetcode id=400 lang=java
 *
 * [400] Nth Digit
 */
class Solution {
    public int findNthDigit(int n) {
    // 该范围内所有实际数字都占用了digit个单数字
    int digit = 1;
    // 该范围之前的所有实际数字已经占用了totalDigit个单数字
    long totalDigit = 0;
    // 先查出区间范围
    while (true) {
        long top = totalDigit + digit * 9 * (long)Math.pow(10, digit -1);
        if(n >= totalDigit && n <= top){
            break;
        } 
        totalDigit = top;
        digit++;
    }
    
    // 根据范围算出具体的值
    int start = (int)Math.pow(10, digit - 1);
    int ret = 0;
    totalDigit += 1;
    // 第n个digit在哪个具体的实际数字上
    int value = start + (n - (int)totalDigit) / digit;
    ret = Integer.toString((int)value).charAt((int)((n - totalDigit)%digit)) - '0';
    return ret;
}
    
}

