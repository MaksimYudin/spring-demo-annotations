package ru.yudin.spring;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "from DatabaseFortuneService";
    }
}
