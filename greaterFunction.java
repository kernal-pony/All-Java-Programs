//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class greaterFunction      
{
    public static double checkGreater(double a,double b)
    {
        double x=a,y=b;
        if(x==y)
        {
            System.out.println("Both are equal Nos!");
            return 0.0;
        }
        
        else{
            if(x>y)
            return x;
            else
            return y;
        }
    }
    public static void main(String aargs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 nos::");
        double a=sc.nextDouble();
        double b=sc.nextDouble();

        System.out.println("The greater Number is::"+checkGreater(a, b));
    }
}