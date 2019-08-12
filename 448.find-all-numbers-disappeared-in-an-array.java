import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

    
        List<Integer> result=new LinkedList<Integer>(); 
        //将nums[num[i]-1]的位置标记为相反数，表示第i个大的数存在
        //然后遍历哪个位置的数还为正数，该位置还为正数，说明第i大的数不存在    
        int index;
        for(int i=0;i<nums.length;i++){
            index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=0- nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }

        return result;
    }
}

