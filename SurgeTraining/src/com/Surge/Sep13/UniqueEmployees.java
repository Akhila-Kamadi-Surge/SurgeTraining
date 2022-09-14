package com.Surge.Sep13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


class EmployeeData{
    private int employeeId;
    private String employeeName;

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

public class UniqueEmployees {
    static List<EmployeeData> getEmployeeList(){
        List<EmployeeData> list = new ArrayList<EmployeeData>();

        EmployeeData e1 = new EmployeeData();
        e1.setEmployeeId(101);
        e1.setEmployeeName("Akhila");
        list.add(e1);

        EmployeeData e2 = new EmployeeData();
        e2.setEmployeeId(102);
        e2.setEmployeeName("Kamadi");
        list.add(e2);

        EmployeeData e3 = new EmployeeData();
        e3.setEmployeeId(103);
        e3.setEmployeeName("AK");
        list.add(e3);

        EmployeeData e4 = new EmployeeData();
        e4.setEmployeeId(104);
        e4.setEmployeeName("AK");
        list.add(e4);

        return list;
    }

    static HashMap<String, Integer> getEmployeeMap(List<EmployeeData> list){
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < list.size(); i++) {
            if(!map.containsKey(list.get(i).getEmployeeName())) {
                map.put(list.get(i).getEmployeeName(),list.get(i).getEmployeeId());
            }
            else {
                int val = map.get(list.get(i).getEmployeeName());
                map.remove(list.get(i).getEmployeeName());
            }
        }
        return map;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> employeeMap = getEmployeeMap(getEmployeeList());

        for(Entry<String, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID : "+entry.getValue()+"    "+
                    "Employee Name : "+entry.getKey());
        }
    }
}
