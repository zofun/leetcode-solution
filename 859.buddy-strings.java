/*
 * @lc app=leetcode id=859 lang=java
 *
 * [859] Buddy Strings
 */
class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()){
            return false;
        }
        char[] charA=A.toCharArray();
        char[] charB=B.toCharArray();
        short[] mapA=new short[26];
        short[] mapB=new short[26];
        //两个都含有两个以上的重复字母
        for(char ch:charA){
            mapA[ch-'a']++;
        }
        for(char ch:charB){
            mapB[ch-'a']++;
        }
        boolean flag=false;
        for(int i=0;i<26;i++){
            if(mapA[i]!=mapB[i]){
                return false;
            }
            if(mapA[i]>=2){
                flag=true;
            }
        }
      

        //找到不同的进行交互后进行比较，看交换后是否相同
        int left=0;
        int right=charA.length-1;
        while(left<charA.length&&charA[left]==charB[left]){
            left++;
        }
        while(right>=0&&charA[right]==charB[right]){
            right--;
        }
        if(right>left){
           char tmp= charA[left];
           charA[left]=charA[right];
           charA[right]=tmp;
            String NA=new String(charA);
            if(NA.equals(B)){
                return true;
            }
            return false;
        }else{
            return flag?true:false;
        }
        
        
    }
}

