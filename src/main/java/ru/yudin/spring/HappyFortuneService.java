package ru.yudin.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "from HappyFortuneService";
    }
}
