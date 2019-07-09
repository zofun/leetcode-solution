/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */
class Solution {
    public int[] plusOne(int[] digits) {
        //首先加一，再进行进位操作
        digits[digits.length-1]+=1;
        //完成除了最高位的进位操作
        for(int i=digits.length-1;i>0;i--){
            if(digits[i]>=10){
                digits[i]%=10;
                digits[i-1]+=1;
            }
        }
        //完成以上处理后还存在digits[0]=10的情况
        //这个时候就需要特殊处理
        if(digits[0]>=10){
            int[] result=new int[digits.length+1];
            result[0]=1;
            result[1]=digits[0]%10;

            for(int i=1;i<digits.length;i++){
                result[i+1]=digits[i];
            }

            return result;
        }

        return digits;
        
    }
}

