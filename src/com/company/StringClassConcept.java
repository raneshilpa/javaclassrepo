package com.company;

import java.util.Arrays;

public class StringClassConcept
{
    public static void main(String[] args)
    {
       /* String s3= new String("java"); //2 object one in srting pool & one in normal heap area
        String s4 = new String("java"); //one object in normal heap area
        String s5 = "java"; //0 object
        String s6 ="java"; //0 object

        String s1 ="address" ; //literal format
        String s2 ="address";
        String s8= new String("address");

      //  s2=s2.toUpperCase(); // explicit assignment
        System.out.println(s1.equals(s8));

        String name = new String("Shilpa");


     //   System.out.println(s2);
      //  System.out.println(s1);*/

        System.out.println("----------------------");
        String s = "JavaTutorialTu";
        System.out.println(s.substring(3));
        System.out.println(s.substring(3, 6));
        System.out.println(s.substring(0,4));
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf('a'));
        System.out.println("=========");
        System.out.println(s.indexOf("Tu"));
        System.out.println(s.indexOf("Tu", 7));
        System.out.println(s.replace('T', '$')); //replace all T with $
        System.out.println(s);
        System.out.println(s.replaceFirst("a", "*"));

        System.out.println("+++++++++++++++++++++++");

        int num =12345;
        Integer integerobj= num; //autoboxing

        String st = String.valueOf(num); //static function
        System.out.println(st.substring(1, 4));





        //// primitive to object / object into primitive wrapper classes


        int i1 = Integer.parseInt("123445");
        System.out.println("i1 " +i1);
        double v = Double.parseDouble("1234.567");
        System.out.println("v "+v);


        System.out.println("----------------------");

        String name ="madam";
        char[] chars = name.toCharArray();

        char[] reveArr =new char[chars.length];
        for(int i=0;i<chars.length;i++)
        {
            reveArr[(chars.length)-i-1] =chars[i];

        }

        String revstr = new String(reveArr);

        if(revstr.equals(name))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
       /* System.out.println("Reverse array is :");
        System.out.println(Arrays.toString(reveArr)); */






        System.out.println(Arrays.toString(chars));



          for (int i=0;i<name.length();i++)
              System.out.println(chars[i]);



    }








}
