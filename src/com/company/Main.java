package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        String s = makeatea();
        System.out.println("My tea is :"+s);

        int mybudget = budget();
        System.out.println("The budget is "+mybudget);
       //  System.out.println(budget());

        //Main obj = new Main();
        //int budj = obj.budget();
       // System.out.println("the budget is :"+ budj);


    }
    public static String makeatea()
    {
        return "red label";

    }
    public static int budget()
    {
        return 211;

    }


}
