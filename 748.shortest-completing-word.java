import java.util.HashMap;

/*
 * @lc app=leetcode id=748 lang=java
 *
 * [748] Shortest Completing Word
 */
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        String license = "";
        String result  = "";
        for (int i = 0; i < licensePlate.length(); i++) {
            char ch = licensePlate.charAt(i);
            if (Character.isLetter(ch)){
                //全部转换为小写
                license += Character.toLowerCase(ch);
            }
        }
        for (String word: words) {
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                hm.put(word.charAt(i), hm.getOrDefault(word.charAt(i), 0) + 1);
            }
            int cnt = 0;
            for (int i = 0; i < license.length(); i++) {
                char ch = license.charAt(i);
                hm.put(ch, hm.getOrDefault(ch, 0) - 1);
                if (hm.get(ch) < 0) break;
                cnt++;
            }
            if (cnt == license.length()) {
                if ("".equals(result) || word.length() < result.length()) result = word;
            }
        }
        return result;

    }
}

