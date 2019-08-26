import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode id=720 lang=java
 *
 * [720] Longest Word in Dictionary
 */
class Solution {
    public String longestWord(String[] words) {
        String result="";
        int maxLen=0;
        Queue<String> queue=new LinkedList<String>();
        Set<String> set=new HashSet<String>();

        for(String str:words){
            set.add(str);
        }
        for(String str:words){
            if(str.length()==1){
                //将所有长度为1的字符串加入队列
                queue.add(str);
            }
        }
        while(!queue.isEmpty()){
            //获取队头元素
            String str=(String)queue.poll();
            int len=str.length();
            if(len>maxLen){
                maxLen=len;
                result=str;
            }else if(len==maxLen){
                //同长度也要更新，因为要确保字典序最小
                result=str.compareTo(result)<0?str:result;
            }
            
            String temp=str;
            //追加一个字符
            for(int i='a';i<='z';i++){
                str+=(char)i;
                if(set.contains(str)){
                    queue.add(str);
                }
                str=temp;
            }
        }
        return result;

        
    }
}

