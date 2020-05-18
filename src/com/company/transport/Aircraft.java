package com.company.transport;

public class Aircraft extends AirTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Aircraft");
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

    public Aircraft() {
    }

    public Aircraft(String id) {
        super(id);
    }
}
