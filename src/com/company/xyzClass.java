package com.company;

public class xyzClass extends Bank {
 private double primerate;


    @Override
    public void calculateRateOfInterest() {

        double finalRate = getRate() + primerate;

    }
}
