package com.example.demo.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by obed on 10/17/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LakeWithMallardTest {

    @Autowired
    @Qualifier("lake-with-mallard") Lake lake;


    @Test
    public void noise() throws Exception {

        Assert.assertEquals("quack", lake.noise());
    }

}