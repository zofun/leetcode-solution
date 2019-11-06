/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 *
 * algorithms
 * Medium (28.87%)
 * Likes:    6825
 * Dislikes: 403
 * Total Accepted:    1.2M
 * Total Submissions: 4M
 * Testcase Example:  '"abcabcbb"'
 *
 * Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: "abcabcbb"
 * Output: 3 
 * Explanation: The answer is "abc", with the length of 3. 
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3. 
 * ⁠            Note that the answer must be a substring, "pwke" is a
 * subsequence and not a substring.
 * 
 * 
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars=s.toCharArray();
        //用来记录窗口内部，字符的出现的次数，充当map的角色
        int[] freq=new int[256];
        int l=0; //窗口左侧下标
        int r=-1; //窗口右侧下标
        int res=0;
        while(l<chars.length){
            //窗口右侧的元素，纳入窗口，窗口中的元素不会出现重复
            //窗口就向右侧扩张
            if((r<s.length()-1)&&freq[chars[r+1]]==0){
                ++r;
                freq[chars[r]]++;
            }else{
                //窗口右侧的元素，在窗口中已经出现了，则从左侧收缩窗口
                freq[chars[l]]--;
                l++;
            }
            res=Math.max(res,r-l+1);

        }
        return res;
    }
}
// @lc code=end

