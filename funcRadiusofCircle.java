//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class funcRadiusofCircle      
{
    public static double funcRadiusofCircle(double raddius)
    {
        double r=raddius;
        double area =3.147*r*r;
        return area;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the radius of circle::");
        double r=sc.nextDouble();

        System.out.println("the area of circle of Radius"+r+"is:::"+funcRadiusofCircle(r));

    }
}
