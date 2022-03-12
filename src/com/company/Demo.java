package com.company;

public class Demo {
    private String name;
    private int age;
    private Double balance;

    public Demo(String name) {
        this.name = name;
    }
    public Demo()
    {
        this("Shilpa");
    }

    public Demo(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Demo demo =new Demo();
        System.out.println(demo);
        MethodOverloading obj = new MethodOverloading();
        obj.sum(10,10);  //compile time polymorphism
        System.out.println(obj.sum(10,10));

        //multiplication
        System.out.println(obj.multiplication(10,10));
        System.out.println(obj.multiplication(2,3,2));
        System.out.println(obj.multiplication(20,30L));


        //calculate Wage
        EmployeeClass emp = new EmployeeClass();

        System.out.println(emp.calWages(15, 500, 50, 6));
        System.out.println(emp.calWages(15,40,5));


    }



}
