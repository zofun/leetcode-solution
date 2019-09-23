import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1010 lang=java
 *
 * [1010] Pairs of Songs With Total Durations Divisible by 60
 *
 * https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/description/
 *
 * algorithms
 * Easy (46.10%)
 * Likes:    248
 * Dislikes: 21
 * Total Accepted:    17.9K
 * Total Submissions: 38.7K
 * Testcase Example:  '[30,20,150,100,40]'
 *
 * In a list of songs, the i-th song has a duration of time[i] seconds. 
 * 
 * Return the number of pairs of songs for which their total duration in
 * seconds is divisible by 60.  Formally, we want the number of indices i < j
 * with (time[i] + time[j]) % 60 == 0.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: [30,20,150,100,40]
 * Output: 3
 * Explanation: Three pairs have a total duration divisible by 60:
 * (time[0] = 30, time[2] = 150): total duration 180
 * (time[1] = 20, time[3] = 100): total duration 120
 * (time[1] = 20, time[4] = 40): total duration 60
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [60,60,60]
 * Output: 3
 * Explanation: All three pairs have a total duration of 120, which is
 * divisible by 60.
 * 
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 1 <= time.length <= 60000
 * 1 <= time[i] <= 500
 * 
 */
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int result=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<time.length;i++){
           
           
            time[i]%=60;
            //配对
            int perVal=(60-time[i])%60;
            if(map.containsKey(perVal)){
                result+=map.get(perVal);
            }

             //统计
            map.put(time[i], map.getOrDefault(time[i], 0)+1);
            
        }
        return result;
    }
}

