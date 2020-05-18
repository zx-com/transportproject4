package com.company.transport;

public class Train extends LandTransport {
    @Override
    public void drivingMethod() {
        System.out.println("ride by Train");
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

    public Train() {
    }

    public Train(String id) {
        super(id);
    }
}
