
/*
 * @lc app=leetcode id=961 lang=java
 *
 * [961] N-Repeated Element in Size 2N Array
 */
class Solution {
    public int repeatedNTimes(int[] A) {
        for(int k=1;k<=3;k++){
            for(int i=0;i<A.length-k;i++){
                if(A[i]==A[i+k]){
                    return A[i];
                }
            }
        }
        throw null;

    }
}

