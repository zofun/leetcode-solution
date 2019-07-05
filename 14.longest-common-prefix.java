import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {


        //确保输入的有效性，防止内存溢出。
        if(strs.length==0){
            return "";
        }

        List<char[]> charArrayList=new ArrayList<>(strs.length);
        //首先将字符串转换为字符数组

        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            charArrayList.add(strs[i].toCharArray());
            //取最短的字符串的长度
            if(strs[i].length()<minLength){
                minLength=strs[i].length();
            }
        }


        char[] result=new char[minLength];
        char temp;
        for(int i=0;i<minLength;i++){

            //以第一个字符串作为基准
            temp=charArrayList.get(0)[i];

            for(int j=1;j<charArrayList.size();j++){
                //找到第一个不一样的，就直接返回
                if(temp!=charArrayList.get(j)[i]){
                    return new String(result).trim();
                }
            }
            result[i]=temp;
        }

        return new String(result).trim();
        
    }
}

