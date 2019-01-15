//Author: Shivani Vashishta
//Version: 1.0.0
//Purpose: Write a Java program to display Pascal's triangle.  
import java.util.*;
class Pascal
{
    public static void main(String[] args)
    {       
        System.out.println("Enter the number of rows  :");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        System.out.println("The pascal series is :"); 
        for(int i = 0; i < row; i++)
        {
            int num = 1;
            System.out.format("%" + (row-i) * 2 + "s" , "");
               for(int j = 0; j <= i; j++)
                {
                   System.out.format("%4d",num);
                   num = num * (i - j) / (j + 1);
                }
                
            System.out.println();
        }
    }
}