/*
 * @lc app=leetcode id=754 lang=java
 *
 * [754] Reach a Number
 */
class Solution {
    public int reachNumber(int target) {
        //n（1+n）/2==target
        //n+n*n=2target

        if(target<0){
            return reachNumber(target*-1);
        }
        int n=0;
        while(n*(n+1)<2*target){
            n++;
        }
        if(n*(n+1)/2==target){
             //一直往一个方向走，刚好到达
            return n;
        }else{
            //有往反方向走
            if((n*(n+1)/2-target)%2==0){
                return n;
            }else{
                if(n%2==0){
                    return n+1;
                }else{
                    return n+2;
                }
            }
        }

        

        
    }
}

