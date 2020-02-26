import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 *
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 *
 * algorithms
 * Medium (43.05%)
 * Likes:    3170
 * Dislikes: 365
 * Total Accepted:    527.4K
 * Total Submissions: 1.2M
 * Testcase Example:  '"23"'
 *
 * Given a string containing digits from 2-9 inclusive, return all possible
 * letter combinations that the number could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given
 * below. Note that 1 does not map to any letters.
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 
 * 
 * Note:
 * 
 * Although the above answer is in lexicographical order, your answer could be
 * in any order you want.
 * 
 */

// @lc code=start
class Solution {

    String[] keyMapping ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        List<String> result=new LinkedList<String>();
        if("".equals(digits)){
            return result;
        }
        helper("",digits, 0, result);
        return result;
    }

    /**
     * 
     * @param prefix 单个拼接字符串
     * @param str 输入的字符串
     * @param index （index-str.length()之间的字符就是待组合的字符）
     * @param result
     */
    private void helper(String prefix,String str,int index,List<String> result){
        if(index>=str.length()){
            result.add(prefix);
            return;
        }
        String keyVal=keyMapping[str.charAt(index)-'0'];
        for(int i=0;i<keyVal.length();i++){
            helper(prefix+keyVal.charAt(i),str, index+1, result);
        }
    }

}
// @lc code=end

