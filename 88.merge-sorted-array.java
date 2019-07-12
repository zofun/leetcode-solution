import java.util.Arrays;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
      //先合并再排序,这样写没技术含量
      for(int i=m,j=0;i<m+n;i++,j++){
          nums1[i]=nums2[j];
      }

      Arrays.sort(nums1);
    }

   
}

