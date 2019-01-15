//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:Write a program to display the results of different relational operators and logical operators in 
//         Java on two Integer values and two Boolean values. Input values to be given within the program.
import java.util.Scanner;
class RLOperator 
{
    public static void main(String[] args) 
    { 	

    	int num1 , num2 , num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Applying Relational Operator");
        System.out.println("Enter the nos.");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
    	if (num1 > num2)
    	{
    		System.out.println("num1 is greater than numr2.");
    	}
    	else
    	{
    		System.out.println("num2 is greater than num1.");
    	}
         System.out.println("Applying Logical Operators"); 
                  System.out.println("Enter the nos.");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
                boolean result;
        
        result = (num1 > num2) || (num3 > num1);        
        System.out.println("Applying Logical Operator || (OR)");
        System.out.println(result);          
        
        result = (num1 > num2) && (num3 > num1);
        System.out.println("Applying Logical Operator && (AND)"); 
        System.out.println(result);
    }
}