/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        char[] chars=S.toCharArray();
        char[] chart=T.toCharArray();
        int lenA=del(chars);
        int lenB=del(chart);
        //System.out.println(new String(chars)+" "+lenA+"="+new String(chart)+" "+lenB);
        if(lenA!=lenB){
            return false;
        }
        int i=0;
        int j=0;
        
        while(i<chars.length&&j<chart.length){
            if(chars[i]=='#'||chars[i]=='-'){
                i++;
                continue;
            }
            if(chart[j]=='#'||chart[j]=='-'){
                j++;
                continue;
            }
            if(chars[i]!=chart[j]){
                return false;
            }else{
                i++;
                j++;
            }
        }
        return true;
        

        
    }

    private int del(char[] chars){
        //无效长度
        int count=0;
        //光标
        int cur=-1;
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='#'&&cur!=-1){
                //满足删除条件执行删除，同时记录删除的次数
                count+=2;
                //设置空白标记
                chars[cur]='-';
                while(cur>=0&&(chars[cur]=='#'||chars[cur]=='-')){
                    cur--;
                }
                
            
                
            }else if(chars[i]!='#'){
                //正常输入，将光标移动到刚输入的字符后
                //光标后移
                cur=i;
            }else{
                //出现#，但因为之前没有有效字符而无法删除
               
                count++;
            }
        }

        return chars.length-count;
    }
}

