package com.company;

public class Assignment1 {
    public static void main(String[] args) {
        int x=4;
        int y=5;
        int z=6;
        double pi=3.14;
        double radius=4;
        double l=8.0;
        double w=4.0;

        String s = FullName("shilpa", "Rane");
        System.out.println(s);
        System.out.println(FullName("Parul", "Rane"));
        System.out.println("-----------------------------");
        int sq = square(x);
        System.out.println("The square of "+x+ " is :"+sq);
        System.out.println("-----------------------------");
        int add =add_3number(x,y,z);
        System.out.println("Addition of "+x+ " "+y+" "+z+" is : "+add);
        System.out.println("-----------------------------");
        double v = AreaofCircle(pi, radius);
        System.out.println("Area of circle is "+v);
        System.out.println("-----------------------------");
        Assignment1 as = new Assignment1();
        //System.out.println(as.AreaofRectangle(l, w));
        double v1 = as.AreaofRectangle(l, w);
        System.out.println("Area of rectangle is "+v1);


    }
    public static String FullName(String firstname, String lastname)
    {
        return firstname+" "+lastname;
    }
    public static int square(int number)
    {
        return number*number;

    }
    public static int add_3number(int x,int y, int z)
    {
        return x+y+z;
    }
    public static double AreaofCircle(double pi,double radius)
    {
        double area=pi*(radius*radius);

        return area;
    }

    public double AreaofRectangle(double length,double width)
    {
        double area_rec = length *width;
        return area_rec;

    }


}
