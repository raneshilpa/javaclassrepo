package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DataTypeClass {

    public static void main(String[] args) {

        int a = 9; //primitive -- stored in stack memory
        Integer b = 10; //class --non primitive
        String s = "shilpa";///s is reference variable stored in heap memory
        char c = 'f';
        byte b2 = 100;  //changes integer literal to byte
        short s2 = 1000;// integer literal given to short
        int u = 100; //integer literal;
        long y = 1000000L;
        long x = 10000000L;
        double d = 1.45567788;
        //int month = 3;


        DataTypeClass s1 = new DataTypeClass(); /// object creation in heap area

        System.out.println(s1);///gives the address of s reference variable

        //one byte = 8 bit
        float g = 12.3388899f;
        System.out.println("Value of g  " + String.format("%.2f", g));
        //num1 = num2;
        //num2+=num1 num2=num2+num1;
        //num2-=num1
        //num2*=num1;
        //++i ---pre-increment
        //i++ ---post increment
        System.out.println("-----------------");
        int t = 10;

        System.out.println(t--);
        System.out.println(t);
        System.out.println(++t);
        System.out.println(t);
        System.out.println(--t);
        System.out.println(t);
        int k = 10;
        int l = 20;
        System.out.println("Relational operator " + (k != l));
        //!= == <= >= > <

        //Logical operator
        //&& ||,!


        if (k > l && k != l) {
            System.out.println("Congratulations");

        } else
            System.out.println("condition false");


        System.out.println("-----------------------------");
        System.out.println("print enter month number(1-12) :");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        printInMonth(month);


    }



    public static void printInMonth(int month)
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println("You haev entered 31 days month ");
        } else if (month == 2)
        {
            System.out.println("Feb month has 28 days");
        } else
            System.out.println("Entered 30 days month");




    }


}

