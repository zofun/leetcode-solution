/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */
class Solution {
    public boolean detectCapitalUse(String word) {

    
        char[] chars=word.toCharArray();
        boolean allUpper=true; //全为大写
        boolean allLower=true; //全为小写
        for(char ch:chars){
            if(isUpper(ch)){
                //是大写
                allLower=false;
            }else{
                allUpper=false;
            }
        }
        if(allLower||allUpper){
            return true;
        }
        //判断首位大写的形式
        if(isUpper(chars[0])){
            boolean flag=true;
            for(int i=1;i<chars.length;i++){
                if(isUpper(chars[i])){
                    flag=false;
                }
            }
            if(flag){
                return true;
            }else{
                return false;
            }
        }
        return false;

        

    }

    /**
     * 判断是否是大写
     * @param ch
     * @return
     */
    private boolean isUpper(char ch){
        if((ch-'a')>=0){
            return false;
        }

        return true;
    }
}

