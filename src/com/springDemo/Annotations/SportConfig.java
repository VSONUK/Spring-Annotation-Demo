package com.springDemo.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.springDemo.Annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneSerice(){
        return new SadFortuneService();
    }
    // define bean for our swim coach and inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneSerice());
    }
}
