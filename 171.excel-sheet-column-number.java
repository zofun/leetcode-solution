/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */
class Solution {
    public int titleToNumber(String s) {

        char[] chars=s.toCharArray();
        int index=0;
        int result=0;
        int val=0;
        while(index<chars.length){
            //do
            
            result=result*26+(int)(chars[index]-'A')+1;
            index++;
        }


        return result;
        
    }
}

