//This program prints GCD of two numbers in Java

import java.util.Scanner;
public class GCD {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int b = sc.nextInt();
        int gcd = 1;
        int min = Math.min(a,b);
        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            gcd = i;
        }
        System.out.println("GCD of "+a+" and "+b+" = "+gcd);
        sc.close();
    }
}
