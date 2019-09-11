/*
 * @lc app=leetcode id=942 lang=java
 *
 * [942] DI String Match
 */
class Solution {
    public int[] diStringMatch(String S) {
        int[] result=new int[S.length()+1];
        char[] chars=S.toCharArray();
        int curD=S.length();
        int curL=0;
        int index=0;
        while(curL<curD){
            if(chars[index]=='I'){
                result[index]=curL;
                curL++;
            }else{
                result[index]=curD;
                curD--;
            }
            index++;
        }
        result[index]=curD;
        return result;
    }
}

