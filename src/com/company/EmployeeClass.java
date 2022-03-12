package com.company;

public class EmployeeClass {

    int empId;
    String name;
    double hourlyRate;
    double bonus;
    int hourWorked;
    int overTimeHours;




    public double calWages(double hourlyRate,double bonus,int hourWorked,int OverTimeHours)
    {
        int totalHour = OverTimeHours+hourWorked;

        double wage = (hourlyRate *totalHour)+bonus;

        return wage;
    }
    public double calWages(int hourlyRate,int hourWorked,int overTimeHours)
    {
        return (hourlyRate*hourWorked)+overTimeHours;

    }












}
