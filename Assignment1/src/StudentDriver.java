import java.io.*;
import java.util.*;
class StudentDriver
{
	public static void main(String[] args)
	{  int n, i;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the no. of students whose data is to be entered" );
       n = input.nextInt();
       ;
       System.out.println("Enter the serial no."); 
       i = input.nextInt();
       
       System.out.println("The personal details of the student " + i + " is:");
          Student s = new Student();
          for (i=0;i<n;i++)
         {
         	 fisrtName = input.next();
         	 s.setFN(qualName);
         	 s.getFN();         	
         	 lastName = input.next();
         	 s.setLN(lastName);
         	 s.getLN();         	 
         	 eMail = input.next();
         	 s.setEmail(eMail);
         	 s.getEmail();         	      	
         	 contactNo= input.next();
         	 s.setContactno(contactNo);
         	 s.getContactno();
         }

        
         System.out.println("All the dates related are is:");
          

          System.out.println("All the dates related are is:");
         
	}
}