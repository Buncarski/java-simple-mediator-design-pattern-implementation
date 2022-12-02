package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mediator mediator = new TempMediator();

        User thermometer = new Thermometer(mediator);
        User phone = new Phone(mediator);

        mediator.addToList(thermometer);
        mediator.addToList(phone);

        thermometer.receive(-11);
        thermometer.sendTo();

        thermometer.receive(-10);
        thermometer.sendTo();
    }
}
