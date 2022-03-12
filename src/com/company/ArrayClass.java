package com.company;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {


        String[] names = new String[10];
      //  Arrays.fill(names,"AAAA");
     //   System.out.println(Arrays.toString(names));
        names[0] ="Shilpa";
        names[1] ="Preety";
        names[2] ="Neha";
        names[3] ="Ajay";
        names[4] ="Rupa";
        names[5] ="Meena";
        names[6] ="Teena";
        names[7] ="Ganesh";
        names[8] ="Vasu";
        names[9] ="Priya";
       System.out.println(Arrays.toString(names));
       Arrays.sort(names);
        System.out.println(Arrays.toString(names));




      //  System.out.println(Arrays.binarySearch(names, "Ajay"));

      Student [] students = new Student[];





    }
    class Student{

        private String name;
        private String course;

        public Student(String name, String course) {
            this.name = name;
            this.course = course;
        }

    }


}