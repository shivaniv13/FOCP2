//Author:Shivani Vashishta
//Version:1.0.0
//Purpose: 2. Write a Java program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):
//i)  its elements.
//ii) Sum of all the elements
//iii)  Largest number in the array
//iv) Smallest number in the array
//v)  Second largest number in the array
//vi) Sum of alternate elements in the array
//vii)  Count of even numbers in the array
//viii) Occurrence of a given number in the array and its frequency

import java.util.*;
class ReadNumber 
{
public static void main(String[] args)
 {    
         int temp = 0;
        int count = 0; 
        int x = 0;
        int sumalt =0;
        int i;
        int sum=0;
        int max;

       Scanner input = new Scanner(System.in);
        int a[] = new int[5];   
       System.out.println("Enter Elements : ");
       for( i=0; i<=4; i++)
       {
           a[i] = input.nextInt();
       }                                    //(i)

       System.out.println("Sum of all the Elements is : ");
       {  for( i=0; i<=4; i++)
          { sum = sum + a[i]; }
         System.out.println(sum);  
      }                                        //(ii)

       System.out.println("The Maximum No. in the array is: ");
       { max = a[0]; 
        for( i=0; i<=4; i++)
          { 
              if (a[i] > max) 
             max = a[i]; 
        }
           System.out.println(max); 
       }                                         //(iii)
       
        System.out.println("The Smallest No. in the array is:");
       {int small = a[0]; 
          for( i=0; i<=4; i++)
          
        {  
            for (int j = i + 1; j < 4; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
                                                                //(iv)
         System.out.println(small); 
       }  
       
       System.out.println("The Sum of Alternate elements in the array is: ");
       {for( i=0; i<=4; i++)
        { if(i%2==0)
        {
            sumalt = sumalt + a[i];
        }
      }
          System.out.println(sumalt);
       }                                     //(vi)

     System.out.println("The count of  even nos. in the array is : ");  
       {for( i=0; i<=4; i++)
        { if(a[i]%2==0)
        
           count++; 
        
        }
        System.out.println(count); 
       }                                     //(viii)

  }
}

    