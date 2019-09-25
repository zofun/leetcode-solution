import java.util.HashSet;
import java.util.Stack;

import javax.print.attribute.HashPrintServiceAttributeSet;

/*
 * @lc app=leetcode id=1021 lang=java
 *
 * [1021] Remove Outermost Parentheses
 *
 * https://leetcode.com/problems/remove-outermost-parentheses/description/
 *
 * algorithms
 * Easy (75.12%)
 * Likes:    223
 * Dislikes: 327
 * Total Accepted:    46.9K
 * Total Submissions: 62.4K
 * Testcase Example:  '"(()())(())"'
 *
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B,
 * where A and B are valid parentheses strings, and + represents string
 * concatenation.  For example, "", "()", "(())()", and "(()(()))" are all
 * valid parentheses strings.
 * 
 * A valid parentheses string S is primitive if it is nonempty, and there does
 * not exist a way to split it into S = A+B, with A and B nonempty valid
 * parentheses strings.
 * 
 * Given a valid parentheses string S, consider its primitive decomposition: S
 * = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 * 
 * Return S after removing the outermost parentheses of every primitive string
 * in the primitive decomposition of S.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: "(()())(())"
 * Output: "()()()"
 * Explanation: 
 * The input string is "(()())(())", with primitive decomposition "(()())" +
 * "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" =
 * "()()()".
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation: 
 * The input string is "(()())(())(()(()))", with primitive decomposition
 * "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" +
 * "()(())" = "()()()()(())".
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "()()"
 * Output: ""
 * Explanation: 
 * The input string is "()()", with primitive decomposition "()" + "()".
 * After removing outer parentheses of each part, this is "" + "" = "".
 * 
 * 
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * S.length <= 10000
 * S[i] is "(" or ")"
 * S is a valid parentheses string
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Integer> pushDownAutomata = new Stack<Integer>();
        char[] sArray = s.toCharArray();
        HashSet<Integer>removeIndices = new HashSet<Integer>();
        for(int i = 0;i < sArray.length; i++) {
            int popPosition = 0;;
            switch(sArray[i]) {
                case '(' : {
                    pushDownAutomata.push(i);
                    break;
                }
                case ')' : {
                    popPosition = pushDownAutomata.pop();
                    break;
                }
                
            }
            
            if(pushDownAutomata.isEmpty()) {
                removeIndices.add(popPosition);
                removeIndices.add(i);
            }                    
            
        }
        
        
        char[] retArray = new char[sArray.length - removeIndices.size()];
        
        int i =0;
        int j = 0;
        while(i < sArray.length) {
            if(removeIndices.contains(i)) {
                i++;
                continue;
            }
            retArray[j++] = sArray[i++];
        }
        
        return new String(retArray);
        
        
    }
}

