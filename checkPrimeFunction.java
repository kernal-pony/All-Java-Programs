import java.util.*;
public class checkPrimeFunction 
{
    public static boolean isPrime(int n)
    {
        int i,num=n,ct=0;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            ct++;
        }
        if(ct==2)
        return true;
        else 
        return false;

    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a nos::");
        int n=sc.nextInt();
        boolean z=isPrime(n);
        if(z==true)
        {
            System.out.println("its a prime nos!!!");
        }
        else
        {
            System.out.println("its not a prime nos!!!");
        }
        
        
    }
}
