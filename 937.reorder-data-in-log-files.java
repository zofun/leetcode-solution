import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=937 lang=java
 *
 * [937] Reorder Data in Log Files
 */
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        if(logs==null || logs.length==0){
            return logs;
        }
        
        Comparator<String> comparator = new StringComp();
        //无限优先级队列
        PriorityQueue<String> heap=new PriorityQueue<>(comparator);
        String[] ans = new String[logs.length];
        int j = logs.length-1;
        for(int i=logs.length-1; i>=0;i--){
            String log = logs[i];
            //标识符后的第一个单词的首字符
            char c = log.charAt(log.indexOf(' ')+1);
            if(c>='0' && c <= '9'){
                //如果是数字型，就加到末尾
                ans[j] = log;
                j--;
            }
            else{
                heap.add(log);
            }
        }
        int i = 0;
        while(heap.size() >0){
            ans[i++] = heap.remove();
        }
        return ans;        
    }
    private class StringComp implements Comparator<String>{
        @Override
        public int compare(String x, String y){
            String subX = x.substring(x.indexOf(' '), x.length());
            String subY = y.substring(y.indexOf(' '), y.length());
            if(subX.equals(subY))
                return x.compareTo(y);
            return subX.compareTo(subY);
        }
        
    }
}

