/*
 * @lc app=leetcode id=908 lang=java
 *
 * [908] Smallest Range I
 */
class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max=A[0];
        int min=A[0];
        for(int num:A){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        int dif=max-min;
        if(dif>=2*K){
            return dif-2*K;
        }else{
            return 0;
        }
        
    }
}

