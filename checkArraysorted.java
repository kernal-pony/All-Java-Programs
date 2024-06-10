/*
Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.
 */



import java.util.*;

public class checkArraysorted
{
    public static void main(String []args)
    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array::");
        int size = sc.nextInt();
        int check=1;
        
        int arr []=new int[size];
        
        
        System.out.println("Enter the elements in array::");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                check =0;
                break;

            }                                                                                                            
        
            
        }
        if(check==1)
            System.out.println("The array is already sorted");
    
        else
            System.out.println("The array is not sorted");
            sc.close();
    }
}
