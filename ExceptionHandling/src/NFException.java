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