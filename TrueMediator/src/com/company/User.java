package com.company;

public abstract class User {
    public Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendTo();

    public abstract void receive(int temp);
}
