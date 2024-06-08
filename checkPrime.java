import java.util.*;
class checkprime
{
    public static void main(String []args)
    
    {
        Scanner sc =new Scanner(System.in);
        int n,ct=0;
        System.out.println("Enter the a nos.:");
        n=sc.nextInt();
        if(n==0 || n==1)
        {
            System.out.println("Invalid Choice .. Get Lost");
            
        }
        else
        {
            for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            ct++;
        }
            if(ct==2)
            System.out.println("It is a prime nos!.");
            else
            System.out.println("its not a prime  nos!");
        }
        
    }
}