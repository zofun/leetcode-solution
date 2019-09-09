/*
 * @lc app=leetcode id=925 lang=java
 *
 * [925] Long Pressed Name
 */
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int index = 0;  
        for (char c: typed.toCharArray()){
            if (name.charAt(index) == c){
                index++;
            }
            if (index == name.length()){
                break;
            }
                
        }
        return index == name.length();
    }
}

