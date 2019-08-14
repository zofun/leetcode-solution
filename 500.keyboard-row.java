import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 */
class Solution {
    public String[] findWords(String[] words) {
        int[] map={2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        List list=new ArrayList<String>();
        for(String str:words){
            char[] chars=str.toLowerCase().toCharArray();

            boolean falg=false;
            int row=0;
            for(char ch:chars){
                if(!falg){
                    row=map[(ch-'a')];
                    falg=true;
                }
                if(row!=map[(ch-'a')]){
                    falg=false;
                    break;
                }
                
            }

            if(falg){
                list.add(str);
                falg=false;
            }
        }
        return (String[]) list.toArray(new String[list.size()]);
    }
}

