/*
 * @lc app=leetcode id=628 lang=java
 *
 * [628] Maximum Product of Three Numbers
 */
class Solution {
    public int maximumProduct(int[] nums) {
        // 最大的三个正数
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;

        // 两个绝对值最大的负数
        int e = Integer.MAX_VALUE;
        int f = Integer.MAX_VALUE;

        int count = 0;
        for (int num : nums) {
            if (num < 0) {
                count++;
                if (num < e) {
                    f = e;
                    e = num;
                } else if (num < f) {
                    f = num;
                }

            }
            if (num > a) {
                c = b;
                b = a;
                a = num;
            } else if (num > b) {
                c = b;
                b = num;
            } else if (num > c) {
                c = num;
            }

        }

    
        int resultA=a*b*c;
       if(count>=2){
           int resultB=e*f*a;
           if(resultA>resultB){
                return resultA;
           }
           return resultB;
       }
       return resultA;

    }
}
