/*
 * @lc app=leetcode id=657 lang=java
 *
 * [657] Robot Return to Origin
 */
class Solution {
    public boolean judgeCircle(String moves) {
        //关键在于向上走的距离和向下走的距离要相等,左走的和右走的也要一致
        int hDirection = 0; 
        int vDirection = 0; 
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    vDirection++;
                    break;
                case 'D':
                    vDirection--;
                    break;
                case 'L':
                    hDirection--;
                    break;
                case 'R':
                    hDirection++;
                default:
                    break;
            }
        }
        return vDirection == 0 && hDirection == 0 ? true : false;

    }
}

