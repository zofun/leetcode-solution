import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=811 lang=java
 *
 * [811] Subdomain Visit Count
 */
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String str:cpdomains){
           
           String[] p= str.split(" ");
           int count=Integer.parseInt(p[0]);
           //太坑了
           String[] domain=p[1].split("\\.");
         

           String url="";
           for(int i=domain.length-1;i>=0;i--){
               
               String sp="";
               if(i!=domain.length-1){
                   sp=".";
               }
               url=domain[i]+sp+url;
               //System.out.println(url+"--"+map.getOrDefault(url,0)+count);
               map.put(url, map.getOrDefault(url,0)+count);
           }
        }
        
        List<String> result=new ArrayList<String>(map.size());

        for(String key:map.keySet()){
            int count=map.get(key);
            result.add(count+" "+key);
        }
        return result;

        
    }
}

