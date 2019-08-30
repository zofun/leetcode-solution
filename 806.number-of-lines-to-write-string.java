/*
 * @lc app=leetcode id=806 lang=java
 *
 * [806] Number of Lines To Write String
 */
class Solution {
    public int[] numberOfLines(int[] widths, String S) {
       
        int[] result=new int[2];
        if(S.length()==0){
            result[0]=0;
            result[1]=0;
            return result;
        }
        int row=0;
        int col=0;
        char[] chars=S.toCharArray();
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            col+=widths[ch-'a'];
            if(col>100){
                //放不下，放入下一行
                row++;
                col=widths[ch-'a'];
              
            }
        }
        result[0]=col==0?row:row+1;
        result[1]=col;

        return result;
    

        
    }
}

