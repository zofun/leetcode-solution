import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=914 lang=java
 *
 * [914] X of a Kind in a Deck of Cards
 */
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];       
        for(int i=0; i<deck.length; i++){       	
        	count[deck[i]]++;      	       	
        }
        
        int gcd = count[0]; 
        for (int i = 1; i < count.length; i++){
            gcd = gcd(count[i], gcd); 
        }        	
        if(gcd<2){
            return false;
        }
        	
        return true;
    }
    
    //计算最大公约数
	public int gcd(int a, int b) { 
        if (a == 0){
            return b; 
        } 
        return gcd(b % a, a); 
    } 
}

