//Author:Shivani Vashishta
//Version:1.0.0

import java.util.*;
class Box
{
	double  width;
	double height;
	double depth;
    Box()
    {
       this.width=0;
	   this.height=0;
	   this.depth=0;
    }
    Box(double w , double h, double d)
    {
          this.width=w;
	      this.height=h;
	      this.depth=d;
    }
    Box(Box b)
    {
          this.width=b.width;
	      this.height=b.height;
	      this.depth=b.depth;
    }
     double DisplayVolume()
     {
        double volume;
        volume=width*height*depth;
        return volume;
     }
     double getw()
     {
       return this.width;
     }

}

class BoxWeight extends Box
{
    double weight;
    BoxWeight()
    {
       super();
       this.weight=0;
    }
    BoxWeight(double w , double h, double d, double wt)
    {
        super(w,h,d);
        this.weight=wt;

    }
     BoxWeight(BoxWeight bw)
    {
        super(bw.weight,bw.height,bw.depth);
        this.weight=bw.weight;

    }
         double DisplayWeight()
     {
          return width;
     }


	
}
class BoxWeightDemo
{
       public static void main (String[] args)
	{
        Scanner input = new Scanner(System.in);
        double w,h,d,wt;
        System.out.println("enter width of box");

        w=input.nextDouble();
        System.out.println("enter height of box");

        h=input.nextDouble();
        System.out.println("enter depth of box");

        d=input.nextDouble();
        System.out.println("enter weight of box");

        wt=input.nextDouble();
         System.out.println("the volme of the box is ");

          BoxWeight bw = new BoxWeight(w,h,d,wt);
          Box b = new Box(w,h,d);
        System.out.println(b.DisplayVolume()+""+ bw.DisplayWeight());
	}
}