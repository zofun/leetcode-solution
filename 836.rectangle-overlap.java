 
/*
 * @lc app=leetcode id=836 lang=java
 *
 * [836] Rectangle Overlap
 */
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean x_overlap = (rec1[0] <= rec2[0] && rec2[0] < rec1[2]) || (rec2[0] <= rec1[0] && rec1[0] < rec2[2]);

        boolean y_overlap = (rec1[1] <= rec2[1] && rec2[1] < rec1[3]) || (rec2[1] <= rec1[1] && rec1[1] < rec2[3]);
        return x_overlap && y_overlap;
    }
}

