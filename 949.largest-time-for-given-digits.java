/*
 * @lc app=leetcode id=949 lang=java
 *
 * [949] Largest Time for Given Digits
 */
class Solution {
    int res=-1;
    public String largestTimeFromDigits(int[] A) {
        boolean[] visited = new boolean[A.length];
        dfs(A, visited, 0);
        int tmp = res;
        StringBuilder sb = new StringBuilder();
        while(tmp > 0) {
            if(sb.length() == 2)
                sb.insert(0, ':');
            sb.insert(0, tmp%10);
            tmp/=10;
        }
        while(sb.length() < 5) {
            if(sb.length() == 2)
                sb.insert(0, ':');
            sb.insert(0, '0');
        }
        return res >= 0 ? sb.toString() : "";
    }
    void dfs(int[] A, boolean[] visited, int tmp){
        if(isAllVisited(visited) && (tmp >= 2400 || tmp%100 >= 60)) 
            return;
        if(isAllVisited(visited))
            res = Math.max(tmp, res);
        for(int i=0;i<A.length;i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(A, visited, tmp*10 + A[i]);
                visited[i] = false;
            }
        }
    }
    
    boolean isAllVisited(boolean[] visited){
        for(boolean v : visited)
            if(!v)
                return false;
        return true;
    }
}

