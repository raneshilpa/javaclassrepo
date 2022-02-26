package com.company;

import java.util.Scanner;

public class Assignment2
{
    public static void main(String[] args) {
  // Q1:take number input from user , if that number is between 1-100 print message congrats
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number= sc.nextInt();
        numberCheckRange(number);
  //Q2: take input of month number from user accordingly print if that month has 30/31/28 days
        System.out.println("Please enter the month 1 to 12 ");
        int month = sc.nextInt();
        daysOfMonth(month);

    }
    public static void numberCheckRange(int num)
    {
        if(num>1 && num<100)
        {
            System.out.println("The entered number "+num+" is between 1-100 ");
        }
        else
            System.out.println("Entered number is not in the given range 1-100");

    }
    public static void daysOfMonth(int month)
    {
        if (month== 1 || month== 3 || month== 5 || month== 7 || month== 8 || month== 10 || month== 12)
        {
            System.out.println("Entered month has 31 days");
        } else if (month== 2)
        {
            System.out.println("Entered month has 28 days");
        } else if (month==4 || month==6 || month==9 || month==11)
            System.out.println("Entered month has 30 days");

    }

}
