/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */
class Solution {
    public int countSegments(String s) {
        char[] chars=s.toCharArray();
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                continue;
            }

            count++;
            while(i<chars.length&&chars[i]!=' ' ){
                i++;
            }
        }
        return count;
    }
}

