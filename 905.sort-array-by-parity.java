
/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] result=new int[A.length];
        int evenCur=0;
        int oddCur=result.length-1;

        for(int  num:A){
            if(num%2==0){
                result[evenCur++]=num;
            }else{
                result[oddCur--]=num;
            }
        }
        return result;
        
    }
}

