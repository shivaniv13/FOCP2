//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:write a program to print the no. of years and days corresponding to the minutes.
import java.util.Scanner;
public class ymdays
 {
  public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
           int minutes = input.nextInt();
           int year = minutes / 525600;
           int day = minutes / 1440;
           int remainingMinutes = day % 525600;
          System.out.println(minutes + " minutes is " + year + " years and "  +  remainingMinutes + " days ");
    }
   }