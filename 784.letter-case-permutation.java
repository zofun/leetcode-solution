import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=784 lang=java
 *
 * [784] Letter Case Permutation
 */
class Solution {
    public List<String> letterCasePermutation(String S) {
    
        Queue<String> queue = new LinkedList<String>();
        queue.offer(S);
        for (int i = 0; i < S.length(); i++) {
            // 是数字就跳过
            if (Character.isDigit(S.charAt(i))){
                continue;
            }
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                //检索但不删除头
                String cur = queue.poll();
                char[] arr = cur.toCharArray();
                // 转成大写，入队列
                arr[i] = Character.toUpperCase(arr[i]);
                queue.offer(String.valueOf(arr));
                // 转成小写，入队列
                arr[i] = Character.toLowerCase(arr[i]);
                queue.offer(String.valueOf(arr));
            }
        }
        return new LinkedList<>(queue);


        
    }


}

