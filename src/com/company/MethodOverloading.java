package com.company;

public class MethodOverloading {


    //Method Overloading is a feature
    // that allows a class to have more than one method having the same name, if their argument lists are different
    public int sum(int a,int b) //signature sum(int,int)
    {
        return  a+b;

    }
    public int sum(int a,int b, int c) //sum(int,int,int)
    {
        return a+b+c;

    }
    public double sum(double a, double b) //sum(double,double)
    {
        return a+b;

    }
    public long sum(int a, long b) //sum(int,long)
    {
        return a+b;
    }
     public int multiplication(int a,int b)
     {
         return(a*b);
     }
     public double multiplication(double a, double b)
     {
         return (a*b);

     }
     public int multiplication(int a, int b, int c)
     {
         return(a*b*c);

     }
     public long multiplication(int a, long b)
     {
         return (a*b);

     }



}
