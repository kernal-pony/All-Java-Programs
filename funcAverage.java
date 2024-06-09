//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class funcAverage 
{
    public static double checkAvearge(double a,double b,double c)
    {
        double x=a,y=b,z=c,avg=0.0;
        avg=(x+y+z)/3.0;
        return avg;

    }                                                                                                                                    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 nos::");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        System.out.println("The average of 3 nos:"+checkAvearge(a, b, c));

    }
}
