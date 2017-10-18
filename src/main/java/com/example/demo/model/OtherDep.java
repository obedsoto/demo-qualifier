package com.example.demo.model;

import org.springframework.stereotype.Component;

/**
 * Created by 210061989 on 18/10/17.
 */
@Component
public class OtherDep {

    public String whoAmI(){
        return "otherDep";
    }
}
