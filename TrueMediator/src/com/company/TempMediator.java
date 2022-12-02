package com.company;

import java.util.ArrayList;
import java.util.List;

public class TempMediator implements Mediator{
    private List<User> users;

    public TempMediator() {
        this.users = new ArrayList<>();
    }


    @Override
    public void sendOut(int temp) {
        for (User u:
             users) {
            if(u instanceof Phone){
                u.receive(temp);
            }
        }
    }

    @Override
    public void addToList(User user) {
        users.add(user);
    }
}
