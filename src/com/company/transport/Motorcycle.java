package com.company.transport;

public class Motorcycle extends LandTransport {
    @Override
    public void drivingMethod() {
        System.out.println("ride by Motorcycle");
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

    public Motorcycle() {
    }

    public Motorcycle(String id) {
        super(id);
    }
}
