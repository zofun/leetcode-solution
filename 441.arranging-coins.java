import com.sun.swing.internal.plaf.basic.resources.basic;

/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */
class Solution {
    public int arrangeCoins(int n) {
        
        
        if(n<1){
            return n;
        }
        long left = 0,right =n;
        while(left<=right){
            long mid = left+(right-left)/2;
            long sum = mid*(mid+1)/2;
            if(sum>n){
                 right = mid-1;
            }else{
               left = mid+1;
            }
        }
        return (int)(left-1);
    

        
    }
}

