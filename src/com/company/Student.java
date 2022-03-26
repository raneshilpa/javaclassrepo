package com.company;

public class Student {
  public static final String COLLEGE_NAME ="Ontario College";
  public static int student_No;
  private String Name;
  private String course;

    public static int getStudent_No() {
        return student_No;
    }

    public static void setStudent_No(int student_No) {
        Student.student_No = student_No;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return Name;
    }

    public String getCourse() {
        return course;
    }



    public static void greet()
    {
        System.out.println();
    }
    public static void main(String[] args)
    {




    }
}
