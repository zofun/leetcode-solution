/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
      
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
           if(nums[Math.abs(nums[i])-1]<0){
               result[0]=Math.abs(nums[i]);
           }else{
               //对应索引位置标记为负数
            nums[Math.abs(nums[i])-1]*=-1;
           }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[1]=i+1;
            }
        }
        return result;
        
    }
}

