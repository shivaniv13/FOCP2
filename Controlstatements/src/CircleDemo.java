//Author:Shivani Vashishta
//Versio:1.0.0
//Purpose: Write a program to find area of circle .
import java.util.*;
public class Circle
{   int r;
       float findAr()
        {       
             float a ; 
            a = Math.PI*r*r;
             return a;

        }
       void displayAr(float a)
        {     System.out.println("Area is " + a);

        }
}        	

public class CircleDemo
{ 
  	public static void main(String args[])
  	{
      Circle c = new Circle();
        c.r=2;
        c.displayAr(c.findAr());
    }

}