// test

public class Employee {
   private String employeeName;
   private int employeeID;
   private double employeeSalary;

 
   public void input(String name, int id, double salary) {
     employeeName = name;
     employeeID = id;
     employeeSalary = salary;

   }
  
   public double calcYearlySalary() {
     return employeeSalary * 12;
   }
  
   public void display(){
     System.out.println("Employee Name: " + employeeName);
     System.out.println("Employee ID: " + employeeID);
     System.out.println("Salary per month: " + employeeSalary);
     System.out.println("Hours Worked: " + hoursWorked);
   }
  
}
