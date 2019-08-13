import java.util.Arrays;

/*
 * @lc app=leetcode id=475 lang=java
 *
 * [475] Heaters
 */
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        if (houses == null || heaters == null) {
            return 0;
        }
        
        Arrays.sort(heaters);
        int result = Integer.MIN_VALUE;
        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);
            if (index < 0) {
                index = -(index + 1);
            }
            int dis = index-1 >= 0 ? house - heaters[index-1] : Integer.MAX_VALUE;
            int dis2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;
            result = Math.max(result, Math.min(dis, dis2));
        }
        return result;
    }
}

