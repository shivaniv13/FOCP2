import java.util.*;
 class Circle
{   int r;
       double findArea()
        {       
             double a ; 
              a = Math.PI*r*r;
               return a;

        }
       void displayArea(double a)
        {   
          System.out.println("Area is " + a);

        }
}        	

public class CircleDemo
{ 
  	public static void main(String args[])
  	{
      Circle c = new Circle();
        c.r=2;
        c.displayArea(c.findArea());
    }

}