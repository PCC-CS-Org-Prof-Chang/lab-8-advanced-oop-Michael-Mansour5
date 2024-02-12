package edu.pasadena.cs.cs03b;

public class Contractor extends Employee implements Freelancer{
    protected int costPerJob;

    public Contractor(String name, int age, int salary, int costPerJob){
        super(name, age, "Contractor", salary);
        this.costPerJob = costPerJob;
    }

    @Override
    public void printFreelancer() {
        System.out.println("I am also a Freelancer! I charge $" + this.costPerJob + " per job.");
    }

    @Override
    public void printJobAndSalary(){
        super.printJobAndSalary();
        printFreelancer();
    }
}
