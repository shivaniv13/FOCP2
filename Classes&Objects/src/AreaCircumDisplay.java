//Author:Shivani Vashishta
//Version:1.0.0
//Purpose:

import java.util.*;
 class Circle
{   double radius;
	double area;
	double cir;
	
	Circle()
	{
	    this.radius=1;
	}
	
	void Circle(double radius)
	{
		this.radius = radius;
	}
       void area()
        {       
            area = Math.PI*radius*radius;
          
        }
       void circumference()
       {           
       	      cir= (2 * Math.PI * radius); 
         
        }
        void display()
        {      System.out.println("Area is " + area);
                 System.out.println("circumference of circle is = " + cir); 
        }
}        	

public class AreaCircumDisplay
{ 
  	public static void main(String args[])
  	{ 
  		Circle c = new Circle();             
       c.area();
       c.circumference();
        c.display();
        
   }
}