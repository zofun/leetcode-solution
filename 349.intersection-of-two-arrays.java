import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set=new HashSet<Integer>();
        Set<Integer> set2=new HashSet<Integer>();
        List<Integer> result=new LinkedList<Integer>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])&&!set2.contains(nums2[i])){
                set2.add(nums2[i]);
                result.add(nums2[i]);
            }
        }


        int[] r=new int[result.size()];
        for(int i=0;i<result.size();i++){
            r[i]=result.get(i);
        }

        return r;
    }
}

