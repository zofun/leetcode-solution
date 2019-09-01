import java.util.*;
/*
 * @lc app=leetcode id=830 lang=java
 *
 * [830] Positions of Large Groups
 */
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ret=new ArrayList<>();
        char[] chars=S.toCharArray();
        int start=0;
        int end=0;
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=chars[i-1]){
                if(end-start>=2){
                    ret.add(Arrays.asList(start,end));
                }
                start=i;
            }
            end=i;
        }
        if(end-start>=2){
            ret.add(Arrays.asList(start,end));
        }
        return ret;
    }
}

