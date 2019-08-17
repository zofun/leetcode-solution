/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */
class Solution {
    public String reverseWords(String s) {

        StringBuffer result=new StringBuffer();
        String[] strings=s.split(" ");
        for(String str:strings){
            char[] chars=str.toCharArray();
            int left=0;
            int right=chars.length-1;
            while(left<right){
                //swap
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;

                left++;
                right--;
            }
            result.append(chars);
            result.append(" ");
        }
        
        return result.toString().trim();
    }
}

