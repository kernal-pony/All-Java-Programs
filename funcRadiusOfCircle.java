//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class funcRadiusOfCircle      
{
    public static double funcRadiusOfCircle(double radius)
    {
        double r=radius;
        double area =3.147*r*r;
        return area;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the radius of circle::");
        double r=sc.nextDouble();

        System.out.println("the area of circle of Radius"+r+"is:::"+funcRadiusOfCircle(r));

    }
}
