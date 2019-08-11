import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        
        List<Integer> result=new LinkedList<Integer>();
        int[] MapP=new int[256];
        int[] MapTemp;
        char[] charsP=p.toCharArray();
        char[] charsS=s.toCharArray();
        //统计p中的字符
        for(char ch:charsP){
            MapP[ch]++;
        }

        for(int index=0;index<=charsS.length-charsP.length;index++){
            System.out.println(charsS[index]);
            MapTemp=MapP.clone(); //这应该拷贝，而不是直接赋值
            boolean flag=true;
            for(int j=index;j<index+charsP.length;j++){
                if(--MapTemp[charsS[j]]<0){
                    flag=false;
                }
            }

            if(flag){
                result.add(index);
            }

        }

        return result;

        
    }
}

