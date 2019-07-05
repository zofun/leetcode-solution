import java.util.Stack;
import java.util.Vector;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */
class Solution {
    public boolean isValid(String s) {
        //这个题显然用栈的方法来解决比较简单，
        //java提供了一个写好的栈，这就舒服了
        Stack stack=new Stack();
    
        char[] chars=s.toCharArray();

        //都不是偶数，肯定不能匹配咯
        if(chars.length%2!=0){
            return false;
        }

        //基本思路就是遇到左括号就入栈，遇到右括号就出栈进行判断
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='('||chars[i]=='['||chars[i]=='{'){
                stack.push(chars[i]);
            }else{
               
                if(!stack.empty()){
                    char temp=(char)stack.pop();
                    if(chars[i]==')'&&temp!='('){
                        return false;
                    }else if(chars[i]==']'&&temp!='['){
                        return false;
                    }else if(chars[i]=='}'&&temp!='{'){
                        return false;
                    }
                    
                }
            }
        }

        if(!stack.empty()){
            return false;
        }

        return true;
        
    }
}

