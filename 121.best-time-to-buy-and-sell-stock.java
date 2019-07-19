/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */
class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length<2){
            return 0;
        }
        int[] result=new int[prices.length];
        int max;
        for(int i=0;i<prices.length-1;i++){
            //向后找最大卖价
            max=prices[i+1];
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>max){
                    max=prices[j];
                }
            }
            result[i]=max-prices[i];
        }

        max=result[0];
        //求全局最优解
        for(int i=0;i<result.length;i++){
            if(result[i]>max){
                max=result[i];
            }
        }

        if(max<0){
            return  0;
        }else{
            return max;
        }
    
    
    }
}

