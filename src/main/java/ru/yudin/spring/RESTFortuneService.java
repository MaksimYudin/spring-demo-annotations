package ru.yudin.spring;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "from RESTFortuneService";
    }
}
