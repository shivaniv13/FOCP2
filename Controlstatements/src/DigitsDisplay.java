//Author:Shivani Vashishta
//Version:1.0.0
//Purpose: Write an application that inputs one number consisting of five digits from the user,separates the number
// into its individual digits in the same order and prints the digits separated from one another by three spaces each.
import java.util.*;
public class DigitsDisplay
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        int digit;
        System.out.print("Enter a positive number: ");
        digit = input.nextInt();
        int power = 1;
        while (power <= digit) {
            power *= 10;
        }
        power /= 10;
        while (power > 0) {
            System.out.print(digit/power + "   ");
            digit %= power;
            power /= 10;
        }
    }
}