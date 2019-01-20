import java.io.*;
import java.util.*;
class Student
{
	String firstName;
    String lastName;
    Address addr;
    Date dob;
    String [] skills;
    Qualification[] qual;
    Project [] projects;
    String eMail;
    String contactNo;

    Student(String firstName,String lasttName,String eMail,String contactNo)
    {
        this.firstName= firstName;
        this.lastName=lastName;
        this.eMail=eMail;
        this.contactNo=contactNo;
   }
   public void setFN(String firstName) 
   {   
      this.firstName= firstName;
   }
   public String getFN()
   {
   	return firstName;
   }
   public void setLN(String lastName) 
   {   
      this.lastName= lastName;
   }
   public String getLN()
   {
   	return lastName;
   }
   public void setEmail(String eMail) 
   {   
      this.eMail= eMail;
   }
   public String getEmail()
   {
   	return eMail;
   }
   public void setContactno(String contactNo) 
   {   
      this.contactNo= contactNo;
   }
   public String getContactno()
   {
   	return contactNo;
   }
 
   public void displaySDetails()
     {
        System.out.println("the personal details of the student is : " + "First Name is =\n" + firstName + "lastName is =" + lastName +
           "Email is= "  + eMail + " Contact No. is  =" +  contactNo );

     }
      

}   

