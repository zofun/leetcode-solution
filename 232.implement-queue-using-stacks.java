import java.util.Stack;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */
class MyQueue {

    Stack stack=new Stack<Integer>();
    Stack supStack=new Stack<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        //存的时候就要倒着存
        while(!stack.isEmpty()){
            supStack.push(stack.pop());
        }

        stack.push(x);
        while(!supStack.isEmpty()){
            stack.push(supStack.pop());
        }

    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return (int)stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return (int)stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

