/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max=-1;
        int top=0;
        //寻找顶点
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
                top=i;
            }
        }
        return isMountainArray(A, top)?top:-1;
        
    }

    private boolean isMountainArray(int[] A,int top){
        //从最高点往左，判断是否是递减的
        for(int i=top;i>0;i--){
            if(A[i-1]>=A[i]){
                System.out.println("往左不满足");
                return false;
            }
        }

        //往右判断
        for(int i=top;i<A.length-1;i++){
            if(A[i]<=A[i+1]){
                System.out.println("往右不满足");
                return false;
            }
        }

        return true;
    }
}

