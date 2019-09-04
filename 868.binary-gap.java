/*
 * @lc app=leetcode id=868 lang=java
 *
 * [868] Binary Gap
 */
class Solution {
    public int binaryGap(int N) {
        int res = 0;
        Integer prev1=null,prev2=null;
        for(int i=0;i<=31;i++){
            if(((N>>i)&1)>0){
                if(prev1==null)
                    prev1=i;
                else if(prev2==null){
                    prev2=i;
                }
                else{
                    prev1 =prev2;
                    prev2 =i;
                }
            }
            if(prev1!=null & prev2!=null)
                res = Math.max(res,prev2-prev1);
        }
        return res;
        
    }
}

