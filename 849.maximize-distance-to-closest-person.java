/*
 * @lc app=leetcode id=849 lang=java
 *
 * [849] Maximize Distance to Closest Person
 */
class Solution {
    public int maxDistToClosest(int[] seats) {
//int seat=0;
        int max=-1;
        for(int i=0;i<seats.length;i++){
            if(seats[i]!=1){
                //是空位，可以入座，计算最小距离
                int distance=getMinDistance(seats, i);
                if(distance>max){
                    max=distance;
                    //seat=i;
                }
            }
        }
        return max;
    }

    private int getMinDistance(int[] seats,int seat){
        int left=0;
        int right=0;
        boolean flag=false;
        //往左边找
        for(int i=seat;i>=0;i--){
            
            if(seats[i]==1){
                flag=true;
                break;
            }
            left++;
        }
        if(!flag){
            //如果左边都没人，就将距离设置为无限大[1,0,0,0]
            left=Integer.MAX_VALUE;
        }
        flag=false;
        //往右边找
        for(int i=seat;i<seats.length;i++){
           
            if(seats[i]==1){
                flag=true;
                break;
            }
            right++;
        }
        if(!flag){
            right=Integer.MAX_VALUE;
        }
        return left<right?left:right;

    }
}

