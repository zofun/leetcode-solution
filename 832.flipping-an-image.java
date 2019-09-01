/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int row=0;row<A.length;row++){
            int left=0;
            int right=A[0].length-1;
            while(left<right){
               //交换
                int tmp=A[row][left];
                A[row][left]=A[row][right];
                A[row][right]=tmp;
                left++;
                right--;
               
            }
            for(int col=0;col<A[0].length;col++){
                if(A[row][col]==0){
                    A[row][col]=1;
                }else{
                    A[row][col]=0;
                }
            }
        }
        return A;
    }

}

