//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:Write a program in java that illustrates Finally Block
public class FinallyBlock
{
	public static void main(String[] args)
	{
	   try
	    {
	        
	         int data=100/0;

	   }
	     finally
	   {
	   	     	   
         System.out.println("rest of the code");
	   }
	 }
}