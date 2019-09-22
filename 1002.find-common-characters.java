import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=1002 lang=java
 *
 * [1002] Find Common Characters
 *
 * https://leetcode.com/problems/find-common-characters/description/
 *
 * algorithms
 * Easy (65.66%)
 * Likes:    421
 * Dislikes: 53
 * Total Accepted:    37.9K
 * Total Submissions: 57.6K
 * Testcase Example:  '["bella","label","roller"]'
 *
 * Given an array A of strings made only from lowercase letters, return a list
 * of all characters that show up in all strings within the list (including
 * duplicates).  For example, if a character occurs 3 times in all strings but
 * not 4 times, you need to include that character three times in the final
 * answer.
 * 
 * You may return the answer in any order.
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] is a lowercase letter
 * 
 * 
 * 
 */
class Solution {
    public List<String> commonChars(String[] A) {
        List<String> result=new LinkedList<String>();
        int[] map=new int[26];
        boolean flag=true;
        for(int i=0;i<A.length;i++){
            char[] chars=A[i].toCharArray();
            if(flag){
                //第一次进入
                for(char ch:chars){
                    map[ch-'a']++;
                }
                flag=false;
            }else{
                int[] tmpMap=new int[26];
                for(char ch:chars){
                    tmpMap[ch-'a']++;
                }
                for(int j=0;j<26;j++){
                    map[j]=Math.min(map[j], tmpMap[j]);
                }

            }

        }

        for(int i=0;i<26;i++){
            if(map[i]!=0){
                String str=String.valueOf((char)(i+'a'));
                for(int j=0;j<map[i];j++){
                    result.add(str);
                }
            }
        }
       
        return result;
    }
}

