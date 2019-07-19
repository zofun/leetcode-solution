/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */
class Solution {
    public int maxProfit(int[] prices) {


        int result=0;
        int n;
        //只需要求相邻两个波峰和波谷之差即可
        for(int i=0;i<prices.length-1;i++){
            n=prices[i+1]-prices[i];
            if(n>0){
                result+=n;
            }
        }
        return result;
        
    }
}

