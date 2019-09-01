import java.util.ArrayList;
import java.util.List;



/*
 * @lc app=leetcode id=821 lang=java
 *
 * [821] Shortest Distance to a Character
 */
class Solution {
    public int[] shortestToChar(String S, char C) {
        char[] chars=S.toCharArray();
        int[] result=new int[chars.length];
        for(int i=0;i<chars.length;i++){
            result[i]=shortestDistance(chars, C, i);
        }
        return result;
       
        
    }
    private int shortestDistance(char[] chars,char c,int index){
        if(chars[index]==c){
            return 0;
        }
        int left=0;
        int right=0;
        boolean flag=false;
        //距离左边的距离
        for(int i=index;i>=0;i--){
          
            if(chars[i]==c){
                flag=true;
                break;
            }
            left++;
        }
        if(!flag){
            left=Integer.MAX_VALUE;
        }

        flag=false;
        for(int i=index;i<chars.length;i++){
           
            if(chars[i]==c){
                flag=true;
                break;
            }
            right++;
        }
        if(!flag){
            right=Integer.MAX_VALUE;
        }
        return left<right?left:right;
    }
}

