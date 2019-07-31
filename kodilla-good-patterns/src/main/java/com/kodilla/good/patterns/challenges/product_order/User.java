package com.kodilla.good.patterns.challenges.product_order;

public class User {

    private String firstName;
    private String lastName;
    private String nick;

    public User(String firstName, String lastName, String nick) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }
}
