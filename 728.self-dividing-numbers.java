import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=728 lang=java
 *
 * [728] Self Dividing Numbers
 */
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int num=left;
        List<Integer> result=new LinkedList<Integer>();
        for(;num<=right;num++){
            if(isSelfDividingNumbers(num)){
                result.add(num);
            }
        }
        return result;
    }

    private List<Integer> split(int num){
        List<Integer> result=new LinkedList<Integer>();
        while(num!=0){
            result.add(num%10);
            num/=10;
        }
        return result;
    }

    private boolean isSelfDividingNumbers(int num){
        List<Integer> nums=split(num);
        for(Integer n:nums){
            if(n==0||num%n!=0){
                return false;
            }
        }
        return true;
    }
}

