import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        List<Integer> result=new LinkedList<Integer>();

        for(int n:nums1){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else{
                map.put(n, 1);
            }
        }

        for(int n:nums2){
            if(map.containsKey(n)){
                //出现的次数
                int count=map.get(n);
                if(count==1){
                    result.add(n);
                    map.remove(n);
                }else{
                    result.add(n);
                    map.put(n,count-1);
                }
            }
        }


        int[] r=new int[result.size()];
        for(int i=0;i<result.size();i++){
            r[i]=result.get(i);
        }

        return r;
    }
}

