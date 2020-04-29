package springbootHibernate.demo.annotations.service;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "This is your normal days";
    }
}
