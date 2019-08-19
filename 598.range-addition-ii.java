/*
 * @lc app=leetcode id=598 lang=java
 *
 * [598] Range Addition II
 */
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        //求出每次操作的最小行和最小列
        int minRow=Integer.MAX_VALUE;
        int minCol=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            minRow=Math.min(minRow, ops[i][0]);
            minCol=Math.min(minCol, ops[i][1]);
        }
        minRow=Math.min(m, minRow);
        minCol=Math.min(n, minCol);
        return minCol*minRow;
    }
}

