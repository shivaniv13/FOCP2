//Author:Shivani Vashishta
//Version:1.0.0
//Purpose: Write a Java program to solve quadratic equations.
import java.util.Scanner;
public class quadraticequations
{
  
  public static void main(String[] Strings)
   {

        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            double result = b * b - 4.0 * a * c;

            if (result > 0.0) 
            {
                double root1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double root2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + root1 + " and " + root2);
                 }
            else if (result == 0.0)
                   {
                double root1 = -b / (2.0 * a);
                System.out.println("The root is " + root1);
            } 
            else
             {
                System.out.println("The equation has no real roots.");
            }
    }
}