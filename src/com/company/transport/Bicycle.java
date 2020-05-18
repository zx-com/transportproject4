package com.company.transport;

public class Bicycle extends LandTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Bicycle");
    }

    @Override
    public void load() {

    }

    @Override
    public void maintain() {

    }

    @Override
    public void addGas() {

    }

    public Bicycle() {
    }

    public Bicycle(String id) {
        super(id);
    }
}
