import java.io.*;
import java.util.*;
class Date
 {
    int startDate;
    int endDate;
    int dob;
    public Date()
    {
    	this.startDate=startDate;
    	this.endDate=endDate;
    	this.dateofBirth=dateofBirth;
    }
     public void setStartdate (int startDate) 
    {
        startDate =  startDate;
    }
     
    public int getStartdate() 
    {
        return  startDate;
    }

    public void setEnddate (int  endDate)
     {
         endDate =  endDate;
    }
     
    public int getEnddate()
     {
        return endDate;
    }
     
    public void setDOB(int dateofBirth )
     {
        dateofBirth = dateofBirth;
    }
     
    public int getDOB() 
    {
        return dateofBirth;
    }
     
    public void displayDate ()
    {
        System.out.printf ("%d/%d/%d\n", getStartdate(), getEnddate(), getDOB());
    }
 
}
 
