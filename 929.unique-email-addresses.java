import java.util.HashSet;

/*
 * @lc app=leetcode id=929 lang=java
 *
 * [929] Unique Email Addresses
 */
class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> uniqueEmails = new HashSet();
        for(String s: emails) {
            String[] localDomain = s.split("@");
            String domain = localDomain[1];
            String local = localDomain[0];
            String localDotIgnored = local.replace(".","");
            int indexOfPlus = localDotIgnored.indexOf("+");
            String localFinal = null;
            if(indexOfPlus != -1) {
                localFinal = localDotIgnored.substring(0, indexOfPlus);
            }
            else {
                localFinal = localDotIgnored;
            }
            uniqueEmails.add(localFinal+"@"+domain);
            
        }
        return uniqueEmails.size();
        
    }
}

