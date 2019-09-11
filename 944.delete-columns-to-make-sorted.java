/*
 * @lc app=leetcode id=944 lang=java
 *
 * [944] Delete Columns to Make Sorted
 */
class Solution {
    public int minDeletionSize(String[] A) {
        if (A == null) return 0;
		int count = 0;
        int len = A[0].toCharArray().length;
		for (int i = 0; i < len; i++) {
			if(isNoSort(A, i)){
                count++;
            }
		}
		return count;
    }
    public static boolean isNoSort(String[] A, int num) {
		char c = A[0].charAt(num);
		for (int i = 0; i < A.length;i++) {
			if (A[i].charAt(num) < c) return true;
			c = A[i].charAt(num);
		}
		return false;
	}
}

