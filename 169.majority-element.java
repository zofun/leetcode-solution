

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */
class Solution {
    public int majorityElement(int[] nums) {
        //可以利用hashmao来实现
        //也可以使用多数投票算法,多数投票算法如下
        //这道题值得好好学习
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }

            if(nums[i]==candidate){
                count++;
            }else{
                count--;
            }
        }

        return candidate;
        
    }
  

}

