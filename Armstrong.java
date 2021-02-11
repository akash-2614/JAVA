import java.util.*;

class Armstrong
{
    public static void main(String[]args)
    {
        Scanner arm = new Scanner(System.in);
        int n,sum=0,n1;
        
        System.out.println("Enter the number: ");
        n = arm.nextInt();
        
        int num = n;

        while(num!=0)
        {
            n1 = num%10;
            sum = sum + (n1*n1*n1);
            num /=10;
        }

        if(sum == n)
            System.out.println("Armstrong number ;-)");
        else
            System.out.println("Not an Armstrong number ;-(");
    }
}