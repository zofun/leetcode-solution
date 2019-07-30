import java.util.Stack;

/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */
class Solution {
    public String convertToTitle(int n) {
    
        Stack stack=new Stack<Character>();
        String result="";
        while(n!=0){
            if(n%26==0){
                stack.push('Z');
                n-=26;
            }else{
                stack.push((char)(n%26-1+'A'));
                n-=n%26;
            }
            n/=26;
        }
        while(stack.size()!=0){
            result+=stack.pop();
        }
        return result;
    }
}

