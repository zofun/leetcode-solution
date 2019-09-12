/*
 * @lc app=leetcode id=953 lang=java
 *
 * [953] Verifying an Alien Dictionary
 */
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int farthestIndex = order.indexOf(words[0].charAt(0));
        int currIndex = -1;
        for (int i = 1; i < words.length; i++) {
            currIndex = order.indexOf(words[i].charAt(0));

            if (farthestIndex < currIndex) {
                farthestIndex = currIndex;
            } else if (farthestIndex == currIndex) {
                if (words[i].length() < words[i - 1].length())
                    return false;
                else {
                    int j = 0;
                    while (j < words[i - 1].length()) {
                        if (order.indexOf(words[i - 1].charAt(j)) > order.indexOf(words[i].charAt(j)))
                            return false;
                        j++;
                    }
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
