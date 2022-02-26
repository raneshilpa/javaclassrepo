package com.company;

public class ForLoopClass {
    public static void main(String[] args) {

        //Assignment Q1: print 1-100 , print 100-1, print only even numbers from 1-100 ,
        // print only odd from 1-100, print numbers 1,3,5,7...100

      int sum;

       /* printOneTo100(); //Print one to 100 numbers
        print100ToOne(); //print 100 to one
        printEvenNum(); //print even numbers between 1 - 100
        printOddNum();//print odd numbers between 1 - 100
        printPatternNum(); //print numbers 1,3,5,7.....100 */

        sum = printSumOneTo10();  //print sum 1 -10
        System.out.println("Sum of 1 to 10 is  :"+sum);

        int factorial = printFactNum(5); //print factorial of number
        System.out.println("Factorial is "+factorial);

        printFabonacciNum(10); //print faboncci series
        nestedForLoopPattern();



    }
    public static void printOneTo100()
    {
        System.out.println("Numbers from 1 to 100 ");
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
        }
    }
    public static void print100ToOne()
    {
        System.out.println("Reverse Numbers from 100 to 1");
        for(int i=100;i>=1;i--)
        {
            System.out.println(i);
        }
    }
    public static void printEvenNum()
    {
        System.out.println("Print even numbers between 1 to 100");
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void printOddNum()
    {
        System.out.println("Print Odd numbers between 1 to 100");
        for(int i=0;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
    public static void printPatternNum()
    {
        System.out.println("Print number pattern 1,3,5,7..100");
        for(int i=1;i<=100;i+=2)
        {
            System.out.println(i);

        }
    }
    public static int printSumOneTo10()
    {
        int sum =0;

        for(int i=0;i<=10;i++)
        {
            sum =sum+i;

        }
        return sum;

    }
    public static int printFactNum(int n)
    {
        int fact=1;

       for(int i=1;i<=n;i++)
       {
           fact = fact*i;

       }
       return fact;

    }
    public static void printFabonacciNum(int number)
    {

        int i=0,num1=0,num2=1;
        int n1=0;
        int n2=1;

        System.out.println("print Fabonacci series using while loop");
        while (i < number) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap the numbers
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            i = i + 1;
        }
        System.out.println("---------------------------------------");
        System.out.println("Print Fabonacci series using for loop");
        for(i=0;i<number;i++)
        {
            System.out.print(n1 + " ");

            // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

        }

    }

    public static void nestedForLoopPattern()
    {
        for(int i=0;i<=5;i++)
        {
            for(int j=1;j<=5;j++) {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }

        for(int i=0;i<=5;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }



}

