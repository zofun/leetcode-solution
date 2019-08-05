/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */
class Solution {
    public boolean isUgly(int num) {
        if(num<=0){
            return false;
        }

        for(int i=2;i<6;i++){
            //循环去除2、3、4(2*2)、5
            while(num%i==0){
                num/=i;
            }
        }
        return num==1?true:false;
    }
}

