package com.company.transport;

public class Automobile extends LandTransport {
    @Override
    public void drivingMethod() {
        System.out.println("ride by Automobile");
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

    public Automobile() {
    }

    public Automobile(String id) {
        super(id);
    }
}
