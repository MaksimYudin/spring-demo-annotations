package ru.yudin.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope("singleton")
public class RandomFortuneService implements FortuneService {

    private String[] fortuneMsg = {"random1", "random2", "random3"};

    private Random random = new Random();

    @Override
    public String getFortune() {
        return fortuneMsg[random.nextInt(fortuneMsg.length)];
    }

    @PostConstruct
    public void myPostConstructor() {
        System.out.println("RandomFortuneService post constructor");
    }

    @PreDestroy
    public void myPredestroy() {
        System.out.println("RandomFortuneService predestroy");
    }
}
