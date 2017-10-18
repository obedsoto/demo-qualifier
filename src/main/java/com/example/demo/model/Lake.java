package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created by obed on 10/17/17.
 */
@Component("base-lake")
public class Lake {

    @Autowired
    OtherDep otherDep;

    private Duck duck;

    public Lake() {
        // This is required by base-lake
    }

    public Lake(Duck duck) {

        this.duck = duck;
    }

    public String noise() {

        return duck.quack();
    }

    public String whoIsOtherDep() {

        return otherDep.whoAmI();
    }
}
