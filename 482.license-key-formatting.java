/*
 * @lc app=leetcode id=482 lang=java
 *
 * [482] License Key Formatting
 */
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        
        char[] chars=S.toUpperCase().toCharArray();
        int count=0;
        String result="";
        String temp="";
        for(int i=chars.length-1;i>=0;i--){
            if(chars[i]=='-'){
                continue;
            }
            result=temp+result;
            temp="";
            result=chars[i]+result;
            count++;
            //确保首位没有'-'
            if(count==K&&i!=0){
               temp="-";
                count=0;
            }
           
        }
        return result;
        
    }
}

