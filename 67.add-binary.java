/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */
class Solution {
    public String addBinary(String a, String b) {

       


        //存在最高位进位的情况，所以预留一个位置
        char[] seqA=(" "+a).toCharArray();
        char[] seqB=(" "+b).toCharArray();

        int maxlen=seqA.length>seqB.length?seqA.length:seqB.length;
        int[] result=new int[maxlen];

        int index=maxlen-1;

        int i;
        int j;
        //先直接相加再进行进位
        for(i=seqA.length-1,j=seqB.length-1;i>0&&j>0;i--,j--){
           
            result[index]=Integer.parseInt(String.valueOf(seqA[i]))+Integer.parseInt(String.valueOf(seqB[j]));
            index--;
        }
        if(i!=0){
            while(i>0){
                result[index]=Integer.parseInt(String.valueOf(seqA[i]));
                index--;
                i--;
            }
           
        }else if(j!=0){

            while(j>0){
                result[index]=Integer.parseInt(String.valueOf(seqB[j]));
                index--;
                j--;
            }
          
        }


        //进行进位操作
        for(int t=maxlen-1;t>0;t--){
           
            if(result[t]>1){
                result[t-1]+=result[t]/2;
                result[t]%=2;
            }
           
        }
      
        StringBuilder resultSB=new StringBuilder();
        if(result[0]!=0){
          
            resultSB.append(result[0]);
        }
        for (i=1;i<result.length;i++) {
          
            resultSB.append(result[i]);
        }


        //这代码写得太垃圾了😭

        return resultSB.toString().trim();
        
    }
}

