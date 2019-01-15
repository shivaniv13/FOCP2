//Author: Shivani Vashishta
//Version: 1.0.0
//Purpose: 3.Write a Java program that reads in two floating-point numbers and tests 
//           whether they are the same up to three decimal places.
import java.util.Scanner;
public class fpnum
{    
  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input floating-point number 1: ");
        double fpnum1 = input.nextDouble();
        System.out.print("Input floating-point number 2: ");
        double fpnum2= input.nextDouble();

        fpnum1= Math.round(fpnum1* 1000);
        fpnum1= fpnum1 / 1000;

        fpnum2= Math.round(fpnum2 * 1000);
        fpnum2 = fpnum2/ 1000;

        if (fpnum1 == fpnum2)
        {
            System.out.println("They are same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}      