//Author:Shivani Vashishta
//Version:1.0.0
//Pupose:5.	Write a Java program that asks the user to provide a single character from 	the alphabet.
//Print Vowel or Consonant , depending on the user input. 

import java.util.*;
class CharVowel
{
	public static void main(String[ ] arg)
	{
	   Scanner input=new Scanner(System.in);
	     System.out.println("Enter a character : ");
	    char ch=input.next( ).charAt(0);	 		
	     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	System.out.println("Entered character "+ch+" is  Vowel"); 
	}
	else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{    
			System.out.println("Entered character "+ch+" is Consonant");
		}
	      else
		{
			System.out.println("Not an alphabet");
		}
	}
}