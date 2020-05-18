package com.company.transport;

public class Hovercraft extends MaritimeMeansOfTransport {
    @Override
    public void drivingMethod() {
        System.out.println("ride by Hovercraft");
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

    public Hovercraft() {
    }

    public Hovercraft(String id) {
        super(id);
    }
}
