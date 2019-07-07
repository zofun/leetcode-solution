/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */
class Solution {
    public int removeDuplicates(int[] nums) {


        if(nums.length==0){
            return 0;
        }
        int cur;//记录当前位置的值
        int delLen=0; //当前重复的数字的长度

        int len=nums.length;
   
       int i=0;
        for( i=0;i<len-1;i++){
            
            //首先找出一整段重复的数
            if(nums[i]==nums[i+1]){
                delLen++;
            }else{
               
                //删除一整段重复的数字
                for(int j=i+1-delLen;j<len-delLen;j++){
                
                    nums[j]=nums[j+delLen];
                }

                //从刑计算长度
                len-=delLen;
                //回退下标
                i-=delLen;
                //重置delLen;
                delLen=0;
            }
        }

        if(delLen!=0){
            for(int j=i+1-delLen;j<len-delLen;j++){
                nums[j]=nums[j+delLen];
            }
            len-=delLen;
        }

      
        return len;

    }
}

