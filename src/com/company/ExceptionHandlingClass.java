package com.company;

public class ExceptionHandlingClass
{

    public static void main(String[] args) {
        try
        {
            System.out.println(2/0);
        }
        catch(Exception e)
        {
           e.printStackTrace();
            System.out.println(e.getMessage());
        }
            String name = "Richa";
            System.out.println(name.toUpperCase());

    }
}
