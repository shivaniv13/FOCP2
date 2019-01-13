import java.util.Scanner;

public class merged2arrays
{
   public static void main(String args[])
   {
       int size1, size2, size, i, j, k;
       int a1[] = new int[50];
       int a2[] = new int[50];
       int mergedarray[] = new int[100];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array 1 Size : ");
       size1 = scan.nextInt();
	   
       System.out.print("Enter Array 1 Elements : ");
       for(i=0; i<size1; i++)
       {
           a1[i] = scan.nextInt();
       }
	   
       System.out.print("Enter Array 2 Size : ");
       size2 = scan.nextInt();
	   
       System.out.print("Enter Array 2 Elements : ");
       for(i=0; i<size2; i++)
       {
           a2[i] = scan.nextInt();
       }
	   
       System.out.print("Merging the Arrays...\n");
       for(i=0; i<size1; i++)
       {
           mergedarray[i] = a1[i];
       }
	   
       size = size1 + size2;
	   
       for(i=0, k=size1; k<size && i<size2; i++, k++)
       {
           mergedarray[k] = a2[i];
       }
	   
       System.out.print("Now the New Array after Merging is :\n");
       for(i=0; i<size; i++)
       {
           System.out.print(mergedarray[i] + "  ");
       }
   }
}


