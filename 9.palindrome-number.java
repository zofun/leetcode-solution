

/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */
class Solution {
    public boolean isPalindrome(int x) {
        //负数显然不满足要求
        if(x<0){
            return false;
        }
        int temp=x;

        int reverseNum=0;
        //反转，然后比较
        while(temp!=0){
            reverseNum*=10;
            reverseNum+=temp%10;
            temp/=10; 
        }
        if(reverseNum!=x){
            return false;
        }

        return true;
        
    }
}

