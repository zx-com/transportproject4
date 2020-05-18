package com.company.transport;

public class Airship extends AirTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Airship");
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

    public Airship() {
    }

    public Airship(String id) {
        super(id);
    }
}
