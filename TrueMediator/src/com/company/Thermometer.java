package com.company;

public class Thermometer extends User{
    int currentTemp;

    public Thermometer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendTo() {
        mediator.sendOut(currentTemp);
    }

    @Override
    public void receive(int temp) {
        currentTemp = temp;
    }
}
