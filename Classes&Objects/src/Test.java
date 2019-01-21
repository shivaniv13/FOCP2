import java.util.*;
class Rectangle
{
	int l;
	int b;
	void display()
	{
	 System.out.println(" The area of the rectangle is :" + (l*b));
	}
	Rectangle(int x , int y)
	{
	 this.l=x;
	 this.b=y;
	}
}
 class Box extends Rectangle
 {
    int h;
    void displayBArea()
    {
      int a = (l*b*h);
      System.out.println("Volume  of the box is :" + a);
    

    }
    Box(int x, int y, int h)
    {
      super(x,y);
      this.h=h;

    }

 }
 class Test
 {
public static  void main(String [] args)
{
  Box ob = new Box(1,1,2);
  ob.display();
  ob.displayBArea();
 }
}
