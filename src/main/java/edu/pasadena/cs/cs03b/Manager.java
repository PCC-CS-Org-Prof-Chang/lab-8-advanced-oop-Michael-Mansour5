package edu.pasadena.cs.cs03b;

import java.util.ArrayList;
public class Manager extends Employee{

    protected ArrayList<Staff> staffList;

    public Manager(String name, int age, int salary){
        super(name, age, "Manager", salary);
        staffList = new ArrayList<Staff>();
    }

    public void addNewStaff(String name, int age, int salary){
        staffList.add(new Staff(name, age, salary));
    }

    public Staff getStaff(int index){
        return staffList.get(index);
    }
}
