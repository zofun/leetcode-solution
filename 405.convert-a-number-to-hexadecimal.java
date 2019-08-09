import java.util.Stack;

/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 */
class Solution {
    public String toHex(int num) {
        char[] Hex={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String result="";
        if(num==0){
            return "0";
        }
        Stack stack=new Stack<Character>();
       for(int i=0;num!=0&&i<8;i++){
           stack.push(Hex[num&0xf]);
           num=num>>4;
       }

       while(stack.size()!=0){
           result+=stack.pop();
       }

       return result;
        
    }

    
}

