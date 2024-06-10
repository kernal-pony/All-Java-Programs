/* 
Find the maximum & minimum number in an array of integers. 

*/


import java.util.*;

public class MAX_MIN_find_in_array
{
    public static void main(String []args)
    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array::");
        int size = sc.nextInt();
        
        int arr []=new int[size];
        
        int max =Integer.MAX_VALUE ;
        int min =Integer.MIN_VALUE;

        System.out.println("Enter the elements in array::");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            if(max>arr[i])
            
                max=arr[i];

            if(min< arr[i])
                min=arr[i];
        }
        System.out.println("The smallest number is::"+max);
        System.out.println("The largest number is::"+min);
        sc.close();

    }
}