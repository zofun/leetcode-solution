import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=762 lang=java
 *
 * [762] Prime Number of Set Bits in Binary Representation
 */
class Solution {
    public int countPrimeSetBits(int L, int R) {
        int result=0;
        //0-20的质数
        int[] primes=new int[]{2, 3, 5, 7, 11, 13, 17, 19 };
        Set<Integer> set=new HashSet<Integer>();
        for(int num :primes){
            set.add(num);
        }
        for(int i=L;i<=R;i++){
           
            //统计二进制表示中一的个数
            int count=0;
            int num=i;
            //计算数字i的二进制表示中一的个数
            for(int j=0;j<20;j++){
                if((num&0x1)==1){
                    count++;
                }
                num>>=1;
            }
            if(set.contains(count)){
                result++;
            }
        }

        return result;
    }
}

