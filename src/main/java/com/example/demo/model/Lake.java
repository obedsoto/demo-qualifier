package com.example.demo.model;

/**
 * Created by obed on 10/17/17.
 */
public class Lake {

    private Duck duck;

    public Lake(Duck duck) {

        this.duck = duck;
    }

    public String noise() {

        return duck.quack();
    }
}
