import java.util.Arrays;

/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        //首先按饼干的大小对饼干排序，然后按孩子欲望的大小对孩子排序
        //拿出第i大的饼干如果孩子能满意，result就加一，给下一位孩子分饼干
        //如果不满意，就取稍大的一块饼干，搞到它满意为止
        //这基本就是贪心算法的思路，每一步取最优解

        int result=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int p=0;//孩子序号
        //第i大的饼干
        for(int i=0;i<s.length;i++){
            //选饼干
            if(s[i]>=g[p]){
                result++;
                p++;

                if(p>=g.length){
                    break;
                }
            }
        }

        return result;
        
    }
}

