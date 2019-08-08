/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left=0;
        int right=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            int re=guess(mid);
            if(re==-1){
                right=mid;
            }else if(re==1){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return 0;

        
    }
}

