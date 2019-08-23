/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */
class Solution {
    public boolean validPalindrome(String s) {
        char[] chars=s.toCharArray();
        int left=0;
        int right=chars.length-1;
        int count=0;
        boolean flag=false;
        while(left<right){
            if(chars[left]==chars[right]){
                left++;
                right--;
            }else{
                count++;
                if(count>1){
                    return false;
                }
                if (chars[left + 1] != chars[right] && chars[left] != chars[right-1]){
                    return false;
                }
				if (chars[left + 1] == chars[right])
				{
					if (right > left + 2 &&chars[left + 2] != chars[right - 1]){
                        flag = true;
                    }
					if (!flag)
					{
						left++;
						continue;
					}
 
				}
				right--;
				flag = false;

            }
        }
        return true;



        
    }
}

