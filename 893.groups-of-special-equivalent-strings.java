import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode id=893 lang=java
 *
 * [893] Groups of Special-Equivalent Strings
 */
class Solution {
    public int numSpecialEquivGroups(String[] A) {
        
        HashSet<String> groups = new HashSet<>();
        for(String s : A) groups.add(convert(s.toCharArray()));
        return groups.size();
    }

    String convert(char[] str) {
        int len = str.length;
        char[] odd = new char[len/2], even = new char[(len+1)/2];
        for(int i = 0; i < str.length; i++) {
            if (i%2 == 0) even[i/2] = str[i];
            else odd[i/2] = str[i];
        }   
        Arrays.sort(odd);
        Arrays.sort(even);
        return new String(odd) + " " + new String(even);
    }
}

