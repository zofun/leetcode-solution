/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[sr].length];
        fill(image, sr, sc, image[sr][sc], newColor, visited);
        return image;
    }
    
    private void fill(int[][] image, int row, int col, int oldColor, 
                      int newColor, boolean[][] visited) {
        if (visited[row][col] || image[row][col] != oldColor) {
            return;
        }
        image[row][col] = newColor;
        visited[row][col] = true;
        if (row + 1 < image.length) {
            fill(image, row + 1, col, oldColor, newColor, visited);
        }
        if (row - 1 >= 0) {
            fill(image, row - 1, col, oldColor, newColor, visited);
        }
        if (col + 1 < image[row].length) {
            fill(image, row, col + 1, oldColor, newColor, visited);
        }
        if (col - 1 >= 0) {
            fill(image, row, col - 1, oldColor, newColor, visited);
        }
    }

}

