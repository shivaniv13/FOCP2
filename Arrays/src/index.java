import java.util.*; 
public class index { 
  
     public static int search(int a[], int t) 
    { 
          if (a == null) { 
            return -1; 
        } 
  
                int len = a.length; 
        int i = 0;
        
          while (i < len) { 
  
                        if (a[i] == t) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    } 
     
    public static void main(String[] args) 
    {   
            int[] arr = new int[10]; 
        Scanner input = new Scanner(System.in);

          System.out.print("Enter the elements" );
          for(int i=0; i<10;i++)
          {
           arr[i]= input.nextInt(); }
         
         System.out.print("Enter the element whose index is to be found" );
         int x = input.nextInt();

        System.out.println("the no. is." + x);
       
        System.out.println("Index position of x is: "
                           + search(arr, x)); 
  
        
    } 
} 