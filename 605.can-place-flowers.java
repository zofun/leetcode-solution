/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                continue;
            }
            //前一个位置的种植状态
            int pre=i==0?0:flowerbed[i-1];
            //后一个位置的种植状态
            int next=i==flowerbed.length-1?0:flowerbed[i+1];
            if(pre==0&&next==0){
                n--;
                flowerbed[i]=1;
            }

        }
        if(n<=0){
            return true;
        }
        return false;
        
    }
}

