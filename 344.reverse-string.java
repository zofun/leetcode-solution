/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */
class Solution {
    public void reverseString(char[] s) {
        if(s.length==0){
            return;
        }
        int left =0;
        int right=s.length-1;
        while(left<right){
            swap(s, left, right);
            left++;
            right--;
        }
        
    }

    private void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}

