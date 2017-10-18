package com.example.demo.config;

import com.example.demo.model.Duck;
import com.example.demo.model.Lake;
import com.example.demo.model.MallardDuck;
import com.example.demo.model.RubberDuck;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by obed on 10/17/17.
 */
@Configuration
public class LakeConfiguration {

    @Bean(name = "rubber")
    public Duck rubber(){
        return new RubberDuck();
    }

    @Bean(name = "mallard")
    public Duck mallard(){
        return new MallardDuck();
    }

    @Bean(name = "lake-with-rubber")
    public Lake lakeWithRubber(@Qualifier("rubber") Duck duck){
        return new Lake(duck);
    }

    @Bean(name = "lake-with-mallard")
    public Lake lakeWithMallard(@Qualifier("mallard") Duck duck){
        return new Lake(duck);
    }

}