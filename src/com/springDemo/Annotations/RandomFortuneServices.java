package com.springDemo.Annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneServices implements FortuneService {

//    create an array
    private String[] data = {
            "hi i am vikash kumar sonu",
        "hi my friend shahzad mujtaba",
        "hi this is vikash profile",
        "hi this shahzad mujtaba profile"
    };
//    create random number generator
    private Random random = new Random();
    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
