package springbootHibernate.demo.annotations.service;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "This is your lucky days";
    }
}
