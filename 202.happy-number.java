import java.util.HashSet;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */
class Solution {
    public boolean isHappy(int n) {
        int[] nums=new int[15];
        int len=split(n, nums);
        int temp=0;
        HashSet<Integer> set=new HashSet<Integer>();
        while(true){

            temp=0;
            for(int i=0;i<len;i++){
                temp+=nums[i]*nums[i];
            }
            if(temp==1){
                return true;
            }

            if(set.contains(temp)){
                return false;
            }
            set.add(temp);
            len=split(temp, nums);
        }

        
        
    }

    int split(int num,int[] nums){
        int i=0;
        while(num!=0){
            nums[i]=num%10;
            num=num/10;
            i++;
        }
        return i;
    }
}

