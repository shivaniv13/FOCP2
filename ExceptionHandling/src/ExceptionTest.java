//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:Create a class with a main( ) that throws an object of class Exception inside a try block. Give the constructor for Exception a String argument. 
//catch the exception inside a catch clause and print the String argument.
// Add a finally clause and print a message to prove you were there.
 class Exception1 extends Exception
  { 
            
           public  Exception1 ( String s )     
            {          super(s);
            	 System.out.println(s);

           	       System.out.println("Exception()");
           }

  }
public class ExceptionTest
{
	public static void d() throws Exception1
	{
		System.out.println(" throwing my exception from d()");
		throw new Exception1("From d()");
	}
	public static void main(String[] args)
	{   
	     try
	    {
            d();
	    }
			
	     catch(Exception1 e) 
	     {
			System.out.println(" Exception1  detected ");
			e.printStackTrace();
		} finally {
			System.out.println(" finally  block is executed");
		}
		
	 }
}