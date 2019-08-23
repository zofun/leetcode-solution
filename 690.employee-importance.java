import java.util.List;

/*
 * @lc app=leetcode id=690 lang=java
 *
 * [690] Employee Importance
 */
/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    private int res=0;
    private Employee employee;
    public int getImportance(List<Employee> employees, int id) {
        
        for(Employee temp : employees){
            if(temp.id == id){
                employee = temp;
                res += employee.importance;
                break;
            }
        }
        List<Integer> list = employee.subordinates;
        int len = list.size();
        for(int i : list){
            getImportance(employees, i);
        }
        return res;


    }
}

