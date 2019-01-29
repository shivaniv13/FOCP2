//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:Write a program in java that illustrates NumberFormatException.
public class NFException
{
	public static void main(String[] args)
	{
	   try
	    {
	        
	         String s="abc"; 
	         int i= Integer.parseInt(s);
	   }
	   catch(NumberFormatException  f)
	   {
	   	   
	   	   System.out.println(f);	
         System.out.println("rest of the code");
	   }
	 }
}