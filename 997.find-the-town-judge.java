import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode id=997 lang=java
 *
 * [997] Find the Town Judge
 *
 * https://leetcode.com/problems/find-the-town-judge/description/
 *
 * algorithms
 * Easy (49.47%)
 * Likes:    240
 * Dislikes: 37
 * Total Accepted:    28.2K
 * Total Submissions: 57K
 * Testcase Example:  '2\n[[1,2]]'
 *
 * In a town, there are N people labelled from 1 to N.  There is a rumor that
 * one of these people is secretly the town judge.
 * 
 * If the town judge exists, then:
 * 
 * 
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * 
 * 
 * You are given trust, an array of pairs trust[i] = [a, b] representing that
 * the person labelled a trusts the person labelled b.
 * 
 * If the town judge exists and can be identified, return the label of the town
 * judge.  Otherwise, return -1.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: N = 2, trust = [[1,2]]
 * Output: 2
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: N = 3, trust = [[1,3],[2,3]]
 * Output: 3
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: N = 3, trust = [[1,3],[2,3],[3,1]]
 * Output: -1
 * 
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: N = 3, trust = [[1,2],[2,3]]
 * Output: -1
 * 
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
 * Output: 3
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 1 <= N <= 1000
 * trust.length <= 10000
 * trust[i] are all different
 * trust[i][0] != trust[i][1]
 * 1 <= trust[i][0], trust[i][1] <= N
 * 
 * 
 */
class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N==1){
            //只有一个人，那他就是法官了
            return 1;
        }
        //记录信任他人的人
        Set<Integer> p=new HashSet<Integer>();
        //记录人们被别人信任的数量
        Map<Integer,Integer> t=new HashMap<Integer,Integer>();
        for(int i=0;i<trust.length;i++){
            p.add(trust[i][0]);
            t.put(trust[i][1], t.getOrDefault(trust[i][1], 0)+1);

        }
        //法官就是被所有人行任，却不信任任何人的人
        for(Integer key:t.keySet()){
            if((t.get(key)==(N-1))&&!p.contains(key)){
                return key;
            }
        }
        return -1;
    }
}

