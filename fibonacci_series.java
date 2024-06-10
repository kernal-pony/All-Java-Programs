/*
 Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

 */



import java.util.*;

public class fibonacci_series 
{

    public static void fibonacci(int n)
    {
        int sum=0,a=0,b=1;
        System.out.print("0"+" "+"1");
        for(int i=1;i<=n;i++)
        {
           
            sum=a+b;
            System.out.print(" "+sum);
            a=b; 
            b=sum;
            
        }
        
    }
    public  static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the range of series");
        int num=sc.nextInt();

        fibonacci(num);
        
    }
    
}
