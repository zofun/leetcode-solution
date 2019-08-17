

/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 */
class Solution {
    public boolean checkRecord(String s) {
        char[] chars=s.toCharArray();
        int Acount=0;
        int LCount=0;
        for(char ch:chars){
            if(ch=='A'){
                Acount++;
            }
            if(ch=='L'){
                LCount++;
            }else{
                LCount=0;
            }
            if(Acount>1||LCount>2){
                return false;
            }
        }
        return true;
        
    }
}

