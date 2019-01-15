//Author:Shivani Vashishta
//Version:1.0.0
// Purpose: Java program to find sum of series 
// 1 + 1/x + x^2/2! + x^3/3! + ....+ x^n/n!

import java.util.Scanner;
class series
{
    public static int factser(int index)
    {
        int f = 1, a;
        for(a= 1; a<= index; a++)
        {
             f= f*a;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a , no , x;
        double frac, sum=1;
        System.out.println("Enter the number of terms i.e n");
        no= in.nextInt();
        System.out.println("Enter the value of x ");
        x = in.nextInt();
        for(a = 1; a <= no; a ++)
        {
            frac= Math.pow(x, a)/factser(a);
            sum = sum + frac;
        }
        System.out.println("The sum for the series 1 + 1/x + x^2/2! + x^3/3! + ....+ x^n/n! is  "+sum);
    }
} 
  