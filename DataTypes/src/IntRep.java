//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:Write a program that prints the integer representation of a given character. 
import java.util.*;
public class IntRep 
{
	public static void main(String[] String)
	 {  Scanner input=new Scanner(System.in);
	       System.out.println("Enter a character : ");
	        char ch=input.next( ).charAt(0);
	        int ascii = ch;
	         System.out.println("The ASCII value of ch is :" +ascii);
	}
}