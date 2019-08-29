/*
 * @lc app=leetcode id=788 lang=java
 *
 * [788] Rotated Digits
 */
class Solution {
    public int rotatedDigits(int N) {
        int result=0;
        for(int i=1;i<=N;i++){
            if(isRotatedDigits(i)){
               
                result++;
            }
        }
        return result;
        
    }

    private boolean isRotatedDigits(int num){
        //如果一个数字只由 0 1 8 2 5 6 9组成，且不只含有0 1 8
        //则它满足条件
        boolean flag=false; //是否包含2 5 6 9
        while(num!=0){
            int n=num%10;
            num/=10;
            if(n==2||n==5||n==6||n==9){
                flag=true;
            }else if(n==0||n==1|n==8){

            }else{
                return false;
            }
        }
        return flag;

    }
}

