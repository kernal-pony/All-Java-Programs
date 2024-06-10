//Write a program to enter the numbers till the user wants and 
//at the end it should display the count of positive, negative and zeros entered.


import java.util.*;
public class countTypeofNumbers 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
    
        int ch,pct=0,nct=0,zct=0;
        
        do{

            System.out.println("Enter a nos.::");
            int num=sc.nextInt();

            if(num==0)
            {
                zct++;
            }
            else if(num>0)
            {
                pct++;
            }
            if(num<0)
            {
                nct++;
            }
            System.out.println("Do you wish to continue? \n 1.YES! \n 2.NO! \n Enter your choice::");
            ch=sc.nextInt();

        }while(ch==1 && ch!=2);

        System.out.println("frequency of Positive nos==>"+pct);
        System.out.println("frequency of Negative nos==>"+nct);
        System.out.println("frequency of Zeroes nos==>"+zct);
    }

    
}
