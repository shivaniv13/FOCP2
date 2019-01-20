import java.io.*;
import java.util.*;
class StudentDriver
{
	public static void main(String[] args)
	{  int n;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the no. of students whose data is to be entered" );
       n = input.nextInt();
       Student s[] = new Student[n];
       for(int i=0; i<=n;i++)
       {
       	  System.out.println("Enter the serial no.");
       	  i = input.nextInt();       	   
          System.out.println("The details of the student " + i + " is:");
        }
         Date display = new Date (0,0,0);

	}
}