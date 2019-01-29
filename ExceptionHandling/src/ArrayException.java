//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:Write a program in java that illustrates ArrayoutofboundsException.

public class ArrayException
{
	public static void main(String[] args)
	{
	   try
	    {
	        
	         int a[]=new int[5];
	         a[10]=50;

	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
	   	   
	   	   System.out.println(e);	
         System.out.println("rest of the code");
	   }
	 }
}