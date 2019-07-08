/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */
class Solution {
    public String countAndSay(int n) {

        //这个题的意思不太好理解，n=1时，输出1，
        //n=2时描述上次的输出（“打印了一个数字一”）即11
        //n=3时描述上次的输出（“打印了两个一”）即21

        //这个题采用递归来实现比较简单

       
        if(n==1){
            return "1";
        }else{
            
            //获取上一次的输出
            String str=countAndSay(n-1)+" ";
            char[] chars=str.toCharArray();
            //统计
            int Count=1;
            String result="";
            for(int i=0;i<chars.length-1;i++){
               if(chars[i]==chars[i+1]){
                   Count++;
               }else{
                
                    //需要注意的是在构造结果的时候，不能直接将
                    //int与char进行拼接（+），因为会将char转换为
                    //int型进行加减而不是拼接
                   result+=Count+""+chars[i];
                   //重置count
                   Count=1;
               }
                
            }
            return result;
        }

       
        
    }
}

