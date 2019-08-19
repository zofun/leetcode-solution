import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



/*
 * @lc app=leetcode id=599 lang=java
 *
 * [599] Minimum Index Sum of Two Lists
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        
        List<String> result=new LinkedList<String>();
        Map map=new HashMap<String,Integer>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
           if(map.containsKey(list2[i])){
               int indexSum=i+(int)map.get(list2[i]);
                if(min==indexSum){
                    result.add(list2[i]);
                }else if(indexSum<min){
                    min=indexSum;
                    result.clear();;
                    result.add(list2[i]);
                }
           }
        }

       return  (String[])result.toArray(new String[result.size()]);
        
    }
}

