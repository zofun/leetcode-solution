/*
 * @lc app=leetcode id=941 lang=java
 *
 * [941] Valid Mountain Array
 */
class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<3){
            return false;
        }
        int max=A[0];
        int top=0;
        for(int i=0;i<A.length;i++){
            if(max<A[i]){
                max=A[i];
                top=i;
            }
        }
        if(top==0||top==A.length-1){
            return false;
        }
        for(int i=0;i<top;i++){
            if(A[i]>=A[i+1]){
                return false;
            }
        }
        for(int i=top;i<A.length-1;i++){
            if(A[i]<=A[i+1]){
                return false;
            }
        }
        return true;
        
    }
}

