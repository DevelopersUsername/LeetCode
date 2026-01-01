/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int getImportance(List<Employee> employees, int id) {

        Map<Integer, Employee> empId = new HashMap<>();
        for (Employee employee : employees)
            empId.put(employee.id, employee);

        return dfs(id, empId);
    }

    private int dfs(int id, Map<Integer, Employee> empId) {

        int val = 0;
        for (int subId : empId.get(id).subordinates)
            val += dfs(subId, empId);

        return empId.get(id).importance + val;
    }
}