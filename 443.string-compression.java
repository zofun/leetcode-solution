/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */
class Solution {
    public int compress(char[] chars) {
        int insert = 0;
        for(int i = 0; i < chars.length; i++) {
            
            int r = i + 1;
            //统计
            while(r < chars.length && chars[r] == chars[i]) {
                r++;
            }
          
            chars[insert++] = chars[i];

           
            int count = r - i;
            if(count > 1) {
                String num = Integer.toString(count);
                for(int j = 0; j < num.length(); j++) {
                    chars[insert++] = num.charAt(j);
                }
            }
            i = r - 1;
        }
        return insert;
    }
}

