


// Q1. Print numbers from 5 to 1.

public class ListOfRecursions
{
    public static void printNumbers(int n) 
    {
        if(n == 0) 
        {
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void main(String args[])
    {
        int n=5;
        printNumbers(n);
    }
}





// Q1. Print numbers from 1 to 5



public static void printNumbers(int n) 
    {
        if(n == 6) 
        {
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String args[])
    {
        int n=1;
        printNumbers(n);
    }




//Print the sum of first n natural numbers.

/*public static void printSum(int n, int sum) {
    if(n == 0) {
    System.out.println(sum);
    return;
    }
    sum += n;
    printSum(n-1, sum);
    }
    public static void main(String args[]) {
    printSum(100, 0);
    }




//Print factorial of a number n.


public static void factorial(int n,int  fact)
{

   if(n==0)
   {

    System.out.println(fact);
    return;
   }
   fact=fact*n;
    factorial(n-1,fact);
}

public static void main(String args[])
{
    
    factorial(5,1);
}




//Print the fibonacci sequence till nth term.



public static void fibonacci(int a,int b,int n,int sum)
{
    
    if(n==0)
    {
        
        return ;
    }


    sum = a+b;
    a=b;
    b=sum;
    System.out.print(" "+sum);
    fibonacci(a, b ,n-1,sum);
    
}


public static void main(String args[]){
    int sum=0;
    System.out.print("0"+" "+"1");
    fibonacci(0,1,10,sum);
}




    public static int printPower(int x, int n)
     {
        if(n == 0) //base case 1
        {
        return 1;
        }
        if(x == 0) // base case 2
        {
        return 0;
        }
        int xPownm1 = printPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String args[]) 
    {
    int x = 2, n = 5;
    int output = printPower(x, n);
    System.out.println(output);
    }


    
    
// Print x^n (with stack height = logn)

public static int printPower(int x, int n) {
    if(n == 0) //base case 1
    {
    return 1;
    }
    else if(n % 2 == 0) // base case 2 checking if n is even
    {
    return printPower(x, n/2) * printPower(x, n/2);
    }
    else // if n is odd
    {
    return x * printPower(x, n/2) * printPower(x, n/2);
    }
    }
    public static void main(String args[]) {
    int x = 2, n = 5;
    int output = printPower(x, n);
    System.out.println(output);
    }

}