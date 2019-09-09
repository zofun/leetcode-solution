/*
 * @lc app=leetcode id=922 lang=java
 *
 * [922] Sort Array By Parity II
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
       int oddIndex=1;
       int evenIndex=0;
       int temp;
       while(oddIndex<A.length&&evenIndex<A.length){
            if(A[evenIndex]%2==1&&A[oddIndex]%2==0){
                temp=A[evenIndex];
                A[evenIndex]=A[oddIndex];
                A[oddIndex]=temp;
            }
            if(A[evenIndex]%2==0){
                evenIndex+=2;
            }
            if(A[oddIndex]%2==1){
                oddIndex+=2;
            }
       }
       return A;
    }
}

