import java.io.*;
import java.util.*;
class Project
{
 String name;
 Date startDate;
 Date endDate;
 String role;
 String [] responsibilities;

 Project(String name, String role )
    {
        this.name=name;
        this.role=role;
        
   }
   public void setName(String name) 
   {   
      this.name=name;
   }
   public void getName()
   {
   	return name;
   }
    public void setRole(String role) 
   {   
      this.role=role;
   }
   public void getRole()
   {
   	return role;
   }
	
}