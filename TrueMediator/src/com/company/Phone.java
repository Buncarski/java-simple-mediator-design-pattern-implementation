package com.company;

public class Phone extends User{


    public Phone(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendTo() {

    }

    @Override
    public void receive(int temp) {
        if(temp < -10) {
            System.out.println("TEMPERATURE IS EXTREMELY LOW: " + temp + " degrees");
        } else if(temp >= -10) {
            System.out.println("TEMPERATURE IS OK: " + temp + " degrees");
        }
    }
}
