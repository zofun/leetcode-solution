import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {

        //这道题的关键在于这个公式
        //A[k][n] = A[k-1][n-1] + A[k-1][n]
        List<List<Integer>> s = new ArrayList<List<Integer>>();
    	if(numRows == 0){
            return s;
        } 
    	ArrayList<Integer> a = new ArrayList<Integer>();
    	a.add(1);   
    	s.add(a);
    	for(int i = 1; i < numRows; i++){
    		List<Integer> t = new ArrayList<Integer>();
    		t.add(1);
    		for(int j = 1; j <= i - 1 ; j++){
    			t.add(s.get(i - 1).get(j - 1) + s.get(i - 1).get(j));
    		}
    		t.add(1);
    		s.add(t);
    	}
    	return s;

        
    }
}

