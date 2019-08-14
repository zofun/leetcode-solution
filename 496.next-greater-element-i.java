import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        Stack<Integer> stack = new Stack<>();
        //key存放元素，value存放找到的第一个大于它的值
        Map<Integer, Integer> map = new HashMap<>();
        //当栈顶元素大于当前元素时，入栈；当栈顶元素小于当前元素时，说明栈顶元素找到了第一个大于的值，出栈，然后继续出栈直到栈顶元素大于当前元素，将当前元素入栈。
        for (int i = 0; i < nums2.length; i++) {
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        //ans数组存放结果
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}

