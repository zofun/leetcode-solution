

/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */
class Solution {
    public int countPrimes(int n) {
        //这道题得使用埃拉托斯特尼筛法才行哦
        //https://www.cnblogs.com/grandyang/p/4462810.html

        boolean[] nums=new boolean[n]; //标记数组,初始全为false
        int count=0;
        for(int i=2;i<n;i++){
            if(!nums[i]){
                count++;
                for(int j=2;i*j<n;j++){
                    nums[i*j]=true;
                }
            }
        }
        return count;

    }


}

