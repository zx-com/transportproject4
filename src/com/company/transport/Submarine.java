package com.company.transport;

public class Submarine extends MaritimeMeansOfTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Submarine");
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

    public Submarine() {
    }

    public Submarine(String id) {
        super(id);
    }
}
