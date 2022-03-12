package com.company;

import java.util.Scanner;

public class WhileLoopClass {
    public static void main(String[] args) {
      int i=1;
      while(true)
      {
          System.out.println(i);

          if(i==5)
          {
              break;
          }
          i=i+1;

      }

        Scanner sc = new Scanner(System.in);
        System.out.println("I have thought a number 1-100");
        int compNum = (int)((Math.random())*100);
        System.out.println("computer entered "+compNum);


       System.out.println("Guess my number");
       while(true)
        {
            int userIntput = sc.nextInt();
            if(userIntput==compNum)
            {
                System.out.println("you won, guess was right");
                break;

            }
            System.out.println("sorry,guess was wrong..guess again");
            System.out.println("Added sout statement");
        }


    }
}
