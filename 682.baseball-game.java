import java.util.Stack;

/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String str : ops) {
            if ("C".equals(str)) {
                stack.pop(); //上一个分数是无效的
            } else if ("D".equals(str)) {
                stack.push(stack.peek()*2);
            } else if ("+".equals(str)) {
                int last = stack.pop();
                int newtop = last + stack.peek();
                stack.push(last);
                stack.push(newtop);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        int sum = 0;
        for (int n : stack) {
            sum += n;
        }
        return sum;
    }
}

