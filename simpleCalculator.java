import java.util.*;
class simple_calculator
{
    public static void main(String []args)
    
    {
        Scanner sc =new Scanner(System.in);
        double a,b;  
        int ch;
        System.out.println("Enter the 2 nos:");
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("1.addition 2.difference 3. product 4. division 5.remainder Enter your choice:");
        ch=sc.nextInt();
        switch (ch) {
            case 1:
            System.out.println("Sum ="+ (a+b));
                
                break;
            case 2:
                System.out.println("Difference ="+ (a-b));
                    
                   break;
            case 3:
                System.out.println("product ="+ (a*b));
                        
                break;
            case 4:
                System.out.println("Division ="+ (a/b));
                            
                break;
            case 5:
                System.out.println("Remainder ="+ (a%b));
                        
                break;
            default:
            System.out.println("Wrong Choice");
                break;
        }

    }
}