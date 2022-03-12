package com.company;

public class Calculator {

    public String type;

    public Calculator() {
    }

    public static void main(String[] args) {


       //Addition
        int add_val = add(10, 20);
        System.out.println("The addition is : "+add_val);
        System.out.println(add(50, 50));

        //substraction

        int sub_val = sub(30, 20);
        System.out.println("The substraction is : "+sub_val);
        System.out.println("The sub is "+sub_val+ "........");
        System.out.println(sub(60, 50));

        //Divison

        System.out.println(division(60, 2));
        float division = division(60, 4);

        //calling by object multiplication


        Calculator obj = new Calculator();
        System.out.println(obj.multiplication(2, 3));


    }

    public static int add(int a, int b)
    {
      return a+b;

    }
    public static int sub(int c, int d)
    {
        return c-d;

    }
    public static float division(int e, int f)
    {
        return e/f;

    }
    public int multiplication(int v,int y)
    {
        return v*y;

    }

    public Calculator(String type) {
        this.type = type;
    }
}






