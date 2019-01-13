// Java program to find sum of series 
// 1 + 1/x + x^2/2 + x^3/3 + ....+ x^n/n

import java.util.*; 
  
class series
{ 
      
static double sum(int x, int n) 
{ 
    double i, total = 1.0; 
    for (i = 1; i <= n; i++) 
        total = total +  
                (Math.pow(x, i) / i); 
  
    return total; 
} 
  
public static void main(String[] args) 
{ Scanner input = new Scanner(System.in);

    int x = input.nextInt(); 
    int n = input.nextInt(); 

    System.out.printf("%.2f", sum(x, n)); 
} 
} 
  