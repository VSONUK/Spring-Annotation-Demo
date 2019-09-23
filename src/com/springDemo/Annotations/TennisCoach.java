package com.springDemo.Annotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// bean id is create
//@Component("thatSillyCoach")
// default bean id lowercase of class name
@Component
//@Scope("singleton")
//@Scope("prototype")
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneServices")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">>  inside the default constructor");
    }
/*
    // define my init method
    public void doMyStartStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destory method
    public void doMyCleanupStuff()
    {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }

 */

//    public FortuneService getFortuneService() {
//        return fortuneService;
//    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">>  inside the setFortuneService ");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println(">>  inside the doSomeCrazyStuff ");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
