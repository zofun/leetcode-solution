/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */
class Solution {
    public int strStr(String haystack, String needle) {

        //这个题还是用kmp算法弄吧


        char[] t=haystack.toCharArray();
        char[] p=needle.toCharArray(); 
        int i=0;
        int j=0;
        int[] next=getNext(p);
        while(i<t.length&&j<p.length){
            if(j==-1||t[i]==p[j]){
                i++;
                j++;
            }else{
                j=next[j];
            }
        }


        if(j==p.length){
            return i-j;
        }else{
            return -1;
        }
      
    }

    /**
     * 计算next数组
     * @param chars
     * @return
     */
    private int[] getNext(char[] chars){
        int[] next=new int[chars.length+1];
        next[0]=-1;
        int i=0;
        int j=-1;
        while(i<chars.length){
            if(j==-1||chars[i]==chars[j]){
                ++i;
                ++j;
                next[i]=j;
            }else{
                j=next[j];
            }
        }
        return next;

      
    }
}

