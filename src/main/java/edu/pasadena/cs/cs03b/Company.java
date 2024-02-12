package edu.pasadena.cs.cs03b;

public class Company {

   private String companyName;

   public Company(String companyName, String name, int age){
      this.companyName = companyName;
      Employer employer1 = new Employer(name, age);
   }
   
   // setter and getter methods for companyName
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   public Employer getEmployer(){
      return employer1;
   }
    public static void main(String [] args) {
      // Create the manager, staff, contractor objects and manage the association of employer and employees
      Employer employer1 = new Employer("Michael", 35);
      employer1.addNewManager("John", 27, 50000);
      employer1.addNewManager("James", 25, 45000);
      employer1.addNewContractor("Ralph", 20, 60000, 200);
      employer1.addNewContractor("Richard", 25, 65000, 350);
      
      // Load data into the objects 
      employer1.getManager(0).addNewStaff("Peter", 21, 15000);
      employer1.getManager(0).addNewStaff("Patrick", 22, 14000);
      employer1.getManager(1).addNewStaff("Bryan", 19, 16000);
      employer1.getManager(1).addNewStaff("Bobby", 30, 19000);
      
      // Print Employer
      employer1.printNameAndAge();

      //Print Managers
      employer1.getManager(0).printNameAndAge();
      employer1.getManager(0).printJobAndSalary();
      employer1.getManager(1).printNameAndAge();
      employer1.getManager(1).printJobAndSalary();

      //Print Contractors
      employer1.getContractor(0).printNameAndAge();
      employer1.getContractor(0).printJobAndSalary();
      employer1.getContractor(1).printNameAndAge();
      employer1.getContractor(1).printJobAndSalary();      
      
      //Print Staff Under John
      employer1.getManager(0).getStaff(0).printNameAndAge();
      employer1.getManager(0).getStaff(0).printJobAndSalary();
      employer1.getManager(0).getStaff(1).printNameAndAge();
      employer1.getManager(0).getStaff(1).printJobAndSalary();

      //Print Staff Under James
      employer1.getManager(1).getStaff(0).printNameAndAge();
      employer1.getManager(1).getStaff(0).printJobAndSalary();
      employer1.getManager(1).getStaff(1).printNameAndAge();
      employer1.getManager(1).getStaff(1).printJobAndSalary();

    } 
 } 
