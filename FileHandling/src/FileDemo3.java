import java.io.*;
import java.util.*;
class FileDemo3
{
   public static void main(String[] args)
    {
      
      try 
      {
            File f = new File("data.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
       boolean flag = true;

            
 	     while(flag)
        {  System.out.print("Enter S.no.:");
               bout.write(Integer.tostring(sc.nextInt()));
                bout.write('');
                System.out.print("Enter NAME.:");
                bout.write(sc.next());
                 bout.write('');
                  System.out.print("Enter cgpa.:");
                   bout.write(Float.tostring(sc.nextFloat()));
                    bout.write('');
                    System.out.print("Enter grade :(A/B/C/D)");
                     bout.write(sc.next().charAt(0));

               bout.newLine();
               System.out.print(" do u want to continue entering data y/ n ");
               char c = sc.next().charAt(0);
               if (c=='n' || c== 'N')
               {
                 flag = false;
                   Scanner sc = new Scanner(System.in);
                   search = sc.next();
                   String sr; 
                   boolean flag = false;
                    System.out.print(" the contents of the file are  ");
                    while((sr=bin.readLine())!=null)
                    {
                       System.out.println(sr);
                       String[] strs = sr.split(" ");
                       for (int i = 0 ; i <strs.length; i++)
                       {
                        if (strs[i].equals(search))
                        {
                          flag =true;
                          break;
                        }
                       }
                    }

               } if ((sr=bin.readLine())==null && flag = flase)
               {
                 System.out.print(" \n Not present  ");
               } else
               {
                 System.out.print ("\n Present");
               }
        }
          
             bout.close();
}         
    catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }   

       }

   }
