/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 *
 * https://leetcode.com/problems/next-permutation/description/
 *
 * algorithms
 * Medium (31.08%)
 * Likes:    2754
 * Dislikes: 942
 * Total Accepted:    321.3K
 * Total Submissions: 1M
 * Testcase Example:  '[1,2,3]'
 *
 * Implement next permutation, which rearranges numbers into the
 * lexicographically next greater permutation of numbers.
 * 
 * If such arrangement is not possible, it must rearrange it as the lowest
 * possible order (ie, sorted in ascending order).
 * 
 * The replacement must be in-place and use only constant extra memory.
 * 
 * Here are some examples. Inputs are in the left-hand column and its
 * corresponding outputs are in the right-hand column.
 * 
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 * 
 */

// @lc code=start
class Solution {

        public void nextPermutation(int[] num) {
            if(num==null||num.length==0)
                return ;
            int i=num.length-2;
            while(i>=0&&num[i]>=num[i+1])
                i--;
            if(i>=0){
                int j=i+1;
                while(j<num.length&&num[j]>num[i])
                    j++;
                j--;
                swap(num,i,j);
            }
            reverse(num,i+1,num.length-1);
        }
        public void swap(int[] num,int i,int j){
            int temp = num[i];
            num[i]=num[j];
            num[j]=temp;
        }
        public void reverse(int[] num,int i,int j){
            while(i<j)
                swap(num,i++,j--);
        }

        
    
}
// @lc code=end

