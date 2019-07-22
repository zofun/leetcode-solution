import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int num=0;
        for(int i=0;i<numbers.length;i++){
            num=target-numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]>num){
                    break;
                }

                if(numbers[j]==num){
                    result[0]=i+1;
                    result[1]=j+1;
                }
            }
        }

        

        return result;
        
    }
}

