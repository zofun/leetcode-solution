import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 *
 * https://leetcode.com/problems/generate-parentheses/description/
 *
 * algorithms
 * Medium (57.11%)
 * Likes:    4133
 * Dislikes: 230
 * Total Accepted:    471.3K
 * Total Submissions: 788.1K
 * Testcase Example:  '3'
 *
 * 
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * 
 * 
 * For example, given n = 3, a solution set is:
 * 
 * 
 * [
 * ⁠ "((()))",
 * ⁠ "(()())",
 * ⁠ "(())()",
 * ⁠ "()(())",
 * ⁠ "()()()"
 * ]
 * 
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {

        return helper("", n, 0, 0);
        
    }

    private List<String> helper(String str,int num,int left,int right){
       List<String> result=new ArrayList<>();
       if(left<num){
           if(left>right){
               //左括号的数量大于右括号的数量，可加左也可加右
               result.addAll(helper(str+'(', num, left+1, right));
               result.addAll(helper(str+")", num, left, right+1));
           }else{
               //左括号的数量等于，一定是左括号
               result.addAll(helper(str+"(", num, left+1, right));

           }
       }
       //如果左括号已经用完了，且右括号还有剩
       if(left==num &&right<num){
           
            for(int i=right;i<num;i++){
                str += ")";
            }
            right = num;
            result.add(str);
        }
    return result;

    }
}
// @lc code=end

