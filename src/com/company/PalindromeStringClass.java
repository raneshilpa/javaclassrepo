package com.company;

public class PalindromeStringClass {
    public static void main(String[] args) {

        String str ="dad";
        char[] str1 = str.toCharArray();
        char[] revstr = new char[str.length()];

        for(int i=0;i<str1.length;i++)
        {
            revstr[(str1.length)-i-1] =str1[i];
        }

        String rev= new String(revstr);

        if(str.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }


    }
}
