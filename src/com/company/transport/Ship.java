package com.company.transport;

public class Ship extends MaritimeMeansOfTransport {
    @Override
    public void drivingMethod() {
        System.out.println("ride by Ship");
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

    public Ship() {
    }

    public Ship(String id) {
        super(id);
    }
}
