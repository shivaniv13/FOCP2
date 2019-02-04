package stack;
import java.util.ArrayList;
import java.util.*;

class arrayli
{
	    int n = 5; 
		//declaring ArrayList with initial size n 
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		 public void push()
		 {
		   for (int i=1; i<=n; i++) 
		   arrli.add(i);
		 }
		 public int pop()
		 {
             arrli.remove(i);
		 }

}
public class arraystack
{

 public static void main (String [] args)
 {
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);
        stack.pop("2");
       
        

    
 }
