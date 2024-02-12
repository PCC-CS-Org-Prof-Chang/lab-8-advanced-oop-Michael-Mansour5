package edu.pasadena.cs.cs03b;

public abstract class Employee extends Person{
    protected String job;
    protected int salary;

    public Employee(String name, int age, String job, int salary){
        super(name, age);
        this.job = job;
        this.salary = salary;
    }
    
    public void printJobAndSalary(){
        System.out.println("I am a " + this.job + " and I make $" + this.salary + " each year!");
    }
}