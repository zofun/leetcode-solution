import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */
class Solution {
    public String[] findRelativeRanks(int[] nums) {

        String[] result=new String[nums.length];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            //记录分数和下标的关系
            map.put(nums[i], i); 

        }
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=len-1;i>=0;i--){
            if(len-i==1){
                result[(int)map.get(nums[i])]="Gold Medal";
            }else if(len-i==2){
                result[(int)map.get(nums[i])]="Silver Medal";
            }else if(len-i==3){
                result[(int)map.get(nums[i])]="Bronze Medal";
            }else{
                result[(int)map.get(nums[i])]=String.valueOf(len-i);
            }
        }
        return result;
        
    }
}

