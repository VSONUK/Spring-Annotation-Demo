package com.springDemo.Annotations;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneServices implements FortuneService {
    @Override
    public String getFortune() {
        return "hi database fortune service";
    }
}
