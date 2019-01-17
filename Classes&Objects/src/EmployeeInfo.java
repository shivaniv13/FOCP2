import java.util.*;
class Employee
 {
    private String name; 
    private String address; 
    private double yearofJoining;
    private double salary;
    Employee()
    {
        this.name="shivani";
        this.address="4th Avenue , New York";        
        this.yearofJoining=2/2/2020;
        this.salary=45000;
    }
 

     public Employee(String name1,String address1, double yearofJoining1 , double salary1)
     {
        name = name1;
        address = address1;
        yearofJoining = yearofJoining1;
         salary = salary1;
    }
 
    public void setName(String name1)
     {
        name = name1;
    }
 
    public String getName() 
    {
        return name;
    }
 
    public void setAddress(String address1) 
    {
        address = address1;
    }
 
    public String getAddress() 
    {
        return address;
    }
 
    public void setyearofJoining(double yearofJoining1) 
    {
        yearofJoining=yearofJoining1;
    }
 
    public double getyearofJoining() 
    {
        return yearofJoining;
    }
 
    public double setSalary(double salary1)
    {
        salary=salary1;        
    }
    
    public double getSalary() 
    {
          return salary;
    }
 
    public void displayInfo()
     {
        System.out.println("Name of the employee is : %s " + name + "Address of the employee is %s " + address + " Year of Joining is "+ 
            yearofJoining +"Salary of the Employee is  :" +salary  );

    }
 
}

 
public class EmployeeInfo
 {
    public static void main(String[] args) 
    {
         
        Employee empl= new Employee();
 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of employees whose data needs to be entered:\n");
        int n = input.nextInt();
         
        String name;
        String address;
        double yearofJoining;
        double salary;
 
        System.out.println("Enter details of employee:\n");
         
        System.out.print("Enter Name: ");
        name = input.next();

        empl.setName(name);
        empl.getName();

        System.out.print("Enter Address: ");
        address= input.next();

        empl.setAddress(address);
        empl.getAddress();

        System.out.print("Enter Year of Joining: ");
        yearofJoining = input.nextDouble();

        empl.setyearofJoining(yearofJoining);
        empl.getyearofJoining();
         

        System.out.print("Enter Year of Joining: ");
        salary= input.nextDouble();

        empl.setSalary(salary);
        empl.getSalary();

       
        empl.displayInfo();
 
    }
}


