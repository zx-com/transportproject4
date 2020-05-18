package com.company.transport;

public class HotAirBalloon extends AirTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by HotAirBalloon");
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

    public HotAirBalloon() {
    }

    public HotAirBalloon(String id) {
        super(id);
    }
}
