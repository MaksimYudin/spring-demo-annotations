package ru.yudin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myBaseballCoach") // with bean id
@Component // with default bean id - baseballCoach
public class BaseballCoach implements Coach {

    // field injection
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public BaseballCoach() {}

    // injection in some method
//    @Autowired
//    public void myTestMethod(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

//    injection in setter
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    /*
    // injection in constructor
    @Autowired
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
     */

    public String getDailyWorkout() {
        return "baseball coach";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
