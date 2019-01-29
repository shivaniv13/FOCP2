//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:Write a program in java that illustrates ArithmeticException.
public class JavaException
{
	public static void main(String[] args)
	{
	   try
	    {
	        
	         int data=100/0;

	   }
	   catch(ArithmeticException e)
	   {
	   	   
	   	   System.out.println(e);	
       System.out.println("rest of the code");
	   }
	 }
}