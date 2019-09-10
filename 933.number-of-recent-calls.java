import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=933 lang=java
 *
 * [933] Number of Recent Calls
 */
class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue=new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        queue.add(t);

        while(t-queue.peek()>3000){
            //判断队头是否已经超时乐
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

