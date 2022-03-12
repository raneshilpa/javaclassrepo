package com.company;

public abstract class Bank
{
    private String name;
    private String address;
    private double rate;
    private double finalRate;
    
    public void setFinalRate(double finalRate) {
        this.finalRate = finalRate;
    }

    public double getRate() {
        return rate;
    }

    private String policy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    public abstract void calculateRateOfInterest();


}
