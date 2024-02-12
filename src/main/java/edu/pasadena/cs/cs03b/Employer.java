package edu.pasadena.cs.cs03b;

import java.util.ArrayList;
public class Employer extends Person{
    protected ArrayList<Manager> managerList;
    protected ArrayList<Contractor> contractorList;
    
    public Employer(String name, int age){
        super(name, age);
        managerList = new ArrayList<Manager>();
        contractorList = new ArrayList<Contractor>();
    }

    public void addNewManager(String name, int age, int salary){
        managerList.add(new Manager(name, age, salary));
    }

    public void addNewContractor(String name, int age, int salary, int costPerJob){
        contractorList.add(new Contractor(name, age, salary, costPerJob));
    }

    public Manager getManager(int index){
        return managerList.get(index);
    }

    public Contractor getContractor(int index){
        return contractorList.get(index);
    }
}
