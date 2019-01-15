//Author:Shivani Vashishta
//Version:1.0.0
//Purpose: Write a program that reads a 2-D integer array with each element of maximum 2 digits and prints the following:
//a)	Elements of the entered array. 
//b)	Elements of the array after each element is multiplied by 2 if it is an odd number

import java.util.*;
class MultiplyOddNum
{        
	public static void main(String[] args)
	{
	     int row, col, i, j;
	   int a[][] = new int[99][99];
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter Number of Row for Array : ");
       row = scan.nextInt();
       System.out.print("Enter Number of Column for Array : ");
       col = scan.nextInt();
	   
       System.out.print("Enter " +(row*col)+ " Array Elements containing maximum 2 digits : ");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {    a[i][j] = scan.nextInt();
            }
        }
	   
       System.out.print("The Array is :\n");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(a[i][j]+ "  ");
           }
           System.out.println();
       }
  
           	
          
           System.out.print("The Array after multiplying odd numbers by 2  is :\n");
                 for(i=0; i<row; i++)
               {
                     for(j=0; j<col; j++)
           {        if (a[i][j]%2!=0)
           	           a[i][j] = (a[i][j])*2;
               System.out.print(a[i][j]+ "  ");
           }
           System.out.println();
       }



   }
}