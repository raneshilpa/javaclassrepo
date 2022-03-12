package com.company;

import java.util.Scanner;

public class FactorialNumClass {
    public static void main(String[] args)
    {
        System.out.println("Please enter the number to calculate factorial : ");
        Scanner scanner = new Scanner(System.in);
        int factNumber = scanner.nextInt();

        int factorial = printFactNum(factNumber); //print factorial of given number
        System.out.println("Factorial of "+factNumber+ " is  : "+factorial);
        System.out.println("my fist sout changes");

    }

    //Function to print factorial of given number
    public static int printFactNum(int n)
    {
        int fact=1;

        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
}
