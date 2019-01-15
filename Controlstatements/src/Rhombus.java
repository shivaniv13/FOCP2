//Author:Shivani Vashishta
// Version: 1.0.0
//Purpose: Write a Java program to display the following character rhombus structure.  
import java.util.Scanner;
class Rhombus 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = sc.nextInt();
        int count = 1;
        int count2 = 1;
        char c = 'A';
           System.out.println("The Rhombus Structure is:");
        for (int i = 1; i < (n * 2); i++) 
        {
            for (int space = n - count2; space> 0; space--)   
                        {
                System.out.print(" ");
            }
            if (i < n) 
            {
                count2++;
            } 
            else 
            {
                count2--;
            }
            for (int j = 0; j < count; j++) 
            {
                System.out.print(c);
                if (j < count / 2) 
                {
                    c++;
                } else 
                { c--;
                }
            }
            if (i < n)
            {
                count = count + 2;
            } 
            else
            {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}