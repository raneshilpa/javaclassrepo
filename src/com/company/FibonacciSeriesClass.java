package com.company;

import java.util.Scanner;

public class FibonacciSeriesClass {
    public static void main(String[] args) {

        System.out.println("How many numbers you want in Fibonacci:");
        Scanner scanner = new Scanner(System.in);
        int maxNumber = scanner.nextInt();
        System.out.println("Fibonacci Series of "+maxNumber+" numbers :");

        printFibonacciNum(maxNumber); //calling function to print fibonacci series

    }
    // Function to print N Fibonacci Number
    public static void printFibonacciNum(int number)
    {

        int i=0,num1=0,num2=1;
        int n1=0;
        int n2=1;

        System.out.println("Print Fibonacci series using while loop");
        while (i < number) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap the numbers
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            i = i + 1;
        }

        System.out.println(" Print Fibonacci series using for loop");
        for(i=0;i<number;i++)
        {
            System.out.print(n1 + " ");

            // Swap the numbers
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

        }

    }
}
