package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

// TODO: implement additional Test Classes for each class in the project
public class TestCompany {

   @Test
   public void testCompanyName()
   {
     String strResult;
     int iResult;
     // create an instance of the class
     Company c = new Company();
      
     // action
     c.setCompanyName("Mansour, Inc.");
     strResult = c.getCompanyName();
     // assertion
     assertEquals("Mansour, Inc.", strResult);

      Employer employer1 = new Employer("Michael", 35);
      c.getEmployer().addNewManager("John", 27, 50000);
      c.getEmployer().addNewManager("James", 25, 45000);
      c.getEmployer().addNewContractor("Ralph", 20, 60000, 200);
      c.getEmployer().addNewContractor("Richard", 25, 65000, 350);
      
      // Load data into the objects 
      c.getEmployer().getManager(0).addNewStaff("Peter", 21, 15000);
      c.getEmployer().getManager(0).addNewStaff("Patrick", 22, 14000);
      c.getEmployer().getManager(1).addNewStaff("Bryan", 19, 16000);
      c.getEmployer().getManager(1).addNewStaff("Bobby", 30, 19000);

      //Test managers
      strResult = c.getEmployer().getManager(0).getName();
      assertEquals("John", strResult);
      strResult = c.getEmployer().getManager(0).getJob();
      assertEquals("Manager", strResult);
      iResult = c.getEmployer().getManager(1).getAge();
      assertEquals(25, iResult);
      iResult = c.getEmployer().getManager(1).getSalary();
      assertEquals(45000, iResult);

      //Test Contractors
      strResult = c.getEmployer().getContractor(0).getName();
      assertEquals("Ralph", strResult);
      strResult = c.getEmployer().getContractor(0).getJob();
      assertEquals("Contractor", strResult);
      iResult = c.getEmployer().getContractor(1).getAge();
      assertEquals(25, iResult);
      iResult = c.getEmployer().getContractor(1).getSalary();      
      assertEquals(65000, iResult);
      
      //Test Staff Under John, which means it should work for staff under James
      strResult = c.getEmployer().getManager(0).getStaff(0).getName();
      assertEquals("Peter", strResult);
      strResult = c.getEmployer().getManager(0).getStaff(0).getJob();
      assertEquals("Staff", strResult);
      iResult = c.getEmployer().getManager(0).getStaff(1).getAge();
      assertEquals(22, iResult);
      iResult = c.getEmployer().getManager(0).getStaff(1).getSalary();
      assertEquals(14000, iResult);

   }
}
