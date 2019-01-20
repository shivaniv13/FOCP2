import java.io.*;
import java.util.*;
class Address
{ 
   String line1;
   String line2;
   String city;
   String state;
   int pinCode;

   Address(String line1, String line2 , String city, String state )
    {
        this.line1= line1;
        this.line2=line2;
        this.city=city;
        this.state=state;
   }
   public void setL1(String line1) 
   {   
      this.line1= line1;
   }
   public String getL1()
   {
   	return line1;
   }
    public void setL2(String line2) 
   {   
      this.line2= line2;
   }
   public String getL2()
   {
   	return line2;
   }
    public void setC(String city) 
   {   
      this.city= city;
   }
   public String getC()
   {
   	return city;
   }
    public void setS(String state) 
   {   
      this.state=state;
   }
   public String getS()
   {
   	return state;
   }
    public void displayAddress () {
        System.out.printf ("%d/%d/%d\n", getDay(), getMonth(), getYear());
    }
 

}