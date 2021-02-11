import java.util.*;

class Amicable
{
    public static void main(String[]args)
    {
        Scanner am = new Scanner(System.in);
        int n1,n2,sum=0;
        
        System.out.println("Enter first number: ");
        n1 = am.nextInt();
        
        System.out.println("Enter second number: ");
        n2 = am.nextInt();
        
        for(int i=1; i<=n1/2; ++i)
        {
            if(n1%i==0)
                sum += i;
        }
        if(sum != n2)
        {
            System.out.println("Not an Amicable number ;-(");
            return;
        }
        sum = 0;

        for(int i=1; i<=n2/2; ++i)
        {
            if(n2%i==0)
                sum += i;
        }

        if(sum != n1)
            System.out.println("Not an Amicable number ;-(");
        else
            System.out.println("Amicable number ;-)");
        
    }
}