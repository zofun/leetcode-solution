import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */
class Solution {
    public boolean lemonadeChange(int[] bills) {

        Stack<Integer> fives = new Stack();
        Stack<Integer> tens = new Stack();
        Stack<Integer> twenties = new Stack();

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fives.push(5);
            }
            if (bills[i] == 10) {
                if (fives.isEmpty()) {
                    return false;
                } else {
                    fives.pop();
                    tens.push(10);
                }
            }
            if (bills[i] == 20) {
                if (tens.isEmpty()) {
                    if (fives.size() < 3) {
                        return false;
                    } else {
                        fives.pop();
                        fives.pop();
                        fives.pop();
                    }
                    twenties.push(20);
                } else {
                    if (fives.isEmpty()) {
                        return false;
                    } else {
                        tens.pop();
                        fives.pop();
                    }
                    twenties.push(20);
                }
            }
        }
        return true;

    }

}
