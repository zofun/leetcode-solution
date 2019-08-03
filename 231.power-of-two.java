/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        
    //https://www.cnblogs.com/xugenpeng/p/9903723.html
      if(n<=0){
          return false;
      }

      if((n&(n-1))==0){
        return true;
      }else{
          return false;
      }
        
    }
}

