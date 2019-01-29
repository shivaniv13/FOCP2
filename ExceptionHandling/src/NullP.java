//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:Write a program in java that illustrates NullPointerException.
public class NullP
{
	public static void main(String[] args)
	{   
	     try
	    {
            String s=null;
            System.out.println(s.length());

	    }
	    catch(NullPointerException e)
	    {  
	    	System.out.println(e);
	    
	       // System.out.println(" null pointer detected");
	    }

	}
}