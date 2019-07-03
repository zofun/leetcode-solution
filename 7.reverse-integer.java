/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */
class Solution {
    public int reverse(int x) {
        if(x <= (Integer.MIN_VALUE) || x > (Integer.MAX_VALUE)){
            return 0;  
        }
      
        int temp;
        double result=0;//为了防止反转后溢出，用表示范围更大的double
        int flag=x<0? -1:1; //符号
        x*=flag;//转化为正数
        while(x!=0){
            temp=x%10;//取最后一位
            x/=10;//去掉最后一位数
            result*=10;//十进制左移一位
            result+=temp;
        }
        //判断溢出，这个地方太坑了
        if(result>Integer.MAX_VALUE){
            return 0;
        }
        return (int)(result*flag);
        
    }
}

